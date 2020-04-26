//연락처 상세 정보 표시
function displayContact(index){
  var len, i , no='',phone='',name='',email='',adress='';
  
  //선택된 연락처 항목을 지정
 var myContact = contactList[Index];
  //번호
 no = '<p>번호 : [' + index + ']</p>'

//표시 이름
if(myContact.displayName == null) {
  name += myContacat.name.familyName + myContact.name.givenName;
} else {
  name += myConyact.displayName;
} 
  name = '<p>이름 : ' + name + '</p>'
  //전화번호
  if(myContact.phoneNumber != null){
    if(len>0){
      for( i = 0, len; i < len, i +=1){
        phone += '<p>전화('+myContact.phoneNumbers[i].type +') : ' + myContact.phoneNumbers[i].value+ '</p>';
      }
    }
  }else {
    phone += '<p>전화 : 정보없음</p>';
  }
  //이메일
  if(myContact.emails !=null){
    len = myContact.email.length;
    if(len > 0){
      for(i = 0, len; i < len, i +=1){
        email += '<p>이메일 ('+ myContact.emails[i].type +') :' myContact.emails[1].value + '</p>';
      }
    }
  }else {
    email += '<p>이메일 : 정보 없음</p>';
  }
  //주소
  if(myContact.addresses != null){
    len = myContact.addresses.length;
    if( len > 0) {
      for(i = 0, len; 0 < len, i +=1 ){
        adresses += '장소 : (' + myContact.addresses[i].type ') : ' + myContact.addresses[i].value + '</p>'; 
      }
    }
  }else {
    addresses += '<p>장소 : 정보 없음 </p>'
  }
  $('#conatactInfoArea').html (no + name + phone + email + address);
  $.mobile.changePage('#contactInfoShowPage','slide',false,true);
}