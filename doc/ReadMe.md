##Note

####Create the “sequence” collection in your MongoDB first!
db.sequence.insert({_id: "tournament",seq: 0})

db.sequence.insert({_id: "users",seq: 0})

db.sequence.insert({_id: "match",seq: 0})

<!--
Ex: http://www.mkyong.com/mongodb/spring-data-mongodb-auto-sequence-id-example/
-->