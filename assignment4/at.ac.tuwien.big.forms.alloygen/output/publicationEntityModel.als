module ME14
sig Publication {
			title: one Int,

		keywords: lone Int,

		doi: lone Int,

		year: lone Int,

		fromPage: lone Int,

		untilPage: lone Int,

		type: one PublicationType,

		assignedFaculty: one Faculty,

		field: one ResearchField,

		authors: some Person,

		proceedings: lone Proceedings,

		journal: lone Journal,

		book: lone Book
}
sig Person {
			firstname: one Int,

		lastname: one Int,

		email: one Int,

		external: lone Int,

		faculty: lone Faculty,

		publibations: one Publication
}
sig Proceedings {
			publisher: lone Int,

		volume: lone Int,

		isbn: lone Int,

		event: one Event,

		editors: set Person
}
sig Journal {
			id: one Int,

		volume: lone Int,

		number: lone Int
}
sig Book {
			publisher: lone Int,

		isbn: lone Int
}
sig PublicationVenue {
			title: one Int
}
sig Event {
			etitle: one Int,

		city: lone Int,

		country: lone Int,

		fromDate: lone Int,

		untilDate: lone Int,

		admissionFrom: lone Int
}
enum Faculty {
	AP, CE, MIE, EEIT, MG, P, TC, I
}
enum ResearchField {
	CSE, QPQT, MM, ICT, EE
}
enum PublicationType {
	JA, BC, CP, WP
}

fact {
all e1: Publication, e2: Person | (e1.authors in e2 implies e2.publibations in e1) and (e2.publibations in e1 implies e1.authors in e2)
all v: Publication | #v.proceedings >= 0
	
all v: Publication | #v.proceedings =< 1
all v: Publication | #v.journal >= 0
	
all v: Publication | #v.journal =< 1
all v: Publication | #v.book >= 0
	
all v: Publication | #v.book =< 1
all v: Person | #v.publibations =< 1
all e1: Person, e2: Publication | (e1.publibations in e2 implies e2.authors in e1) and (e2.authors in e1 implies e1.publibations in e2)
all v: Proceedings | #v.event =< 1
all v: Proceedings | #v.editors >= 0
}
