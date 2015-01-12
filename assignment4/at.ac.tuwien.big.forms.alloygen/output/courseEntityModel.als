module ME14
sig Student {
			name: one Int,

		likes: one Course,

		enrols: one Course
}
sig Course {
			title: one Int,

		isEnroledBy: set Student,

		isLikedBy: set Student
}

fact {
all v: Student | #v.likes =< 1
all e1: Student, e2: Course | (e1.likes in e2 implies e2.isLikedBy in e1) and (e2.isLikedBy in e1 implies e1.likes in e2)
all v: Student | #v.enrols =< 1
all e1: Student, e2: Course | (e1.enrols in e2 implies e2.isEnroledBy in e1) and (e2.isEnroledBy in e1 implies e1.enrols in e2)
all v: Course | #v.isEnroledBy >= 10
all e1: Course, e2: Student | (e1.isEnroledBy in e2 implies e2.enrols in e1) and (e2.enrols in e1 implies e1.isEnroledBy in e2)
all v: Course | #v.isLikedBy >= 5
	
all v: Course | #v.isLikedBy =< 5
all e1: Course, e2: Student | (e1.isLikedBy in e2 implies e2.likes in e1) and (e2.likes in e1 implies e1.isLikedBy in e2)
}
