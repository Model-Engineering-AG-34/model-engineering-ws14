//add your implemented constraint here
fact {
	all p:Publication | 
		(p.type = JA implies #p.journal = 1 and #p.book = 0 and #p.proceedings = 0) and 
		(p.type = BC implies #p.journal = 0 and #p.book = 1 and #p.proceedings = 0) and 
		(p.type = WP or p.type = CP implies #p.journal = 0 and #p.book = 0 and #p.proceedings = 1)
}