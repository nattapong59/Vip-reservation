function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#blah')
                .attr('src', e.target.result);
        };

        reader.readAsDataURL(input.files[0]);
    }
}
function rand(len){
    return Math.floor((Math.random() * 99999) + 10000);
  }
  
  function setRand(){
     document.getElementById('rand').value = rand(9); 
  }