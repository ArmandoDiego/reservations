var AppView = Backbone.View.extend ({
  el: '#app',
  render: function() {
	  $(this.el).html("Welcome to BackboneJS!");
  },
  initialize: function() {
    this.render(); 
  }
});

var aView= new AppView();