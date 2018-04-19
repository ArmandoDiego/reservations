var Employee = Backbone.Model.extend({

    initialize: function(){
    },
    
    defaults: {
        name: 'Fetus',
        age: 0,
    },
    
    changeAge: function( newAge ){
    	this.set({ age: newAge });
    },
    
    getExperience: function(year_of_joining){
    	var date= new Date();
        var experience= date.getFullYear() -year_of_joining;
        employee.set({experience:experience});
        return experience;
    }

});


var employee = new Employee({employee_id:1128223, name:'Diego', year_of_joining:2013, experience:2});//please add properties and values of Employee model
alert("Experience of "+employee.get("name")+" is "+employee.getExperience(employee.get('year_of_joining'))+" years");

//var person = new Person();
//person.set({ name: "John", age: 28});
//person.changeAge(26);
//document.write("Name: "+person.get("name")+" with age: "+person.get("age"));