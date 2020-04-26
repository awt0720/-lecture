var contactList;

//Ư�� ����ó �˻�
function seacrhContact(){
  //�������κ��� �˻� ��� �̸��� ����
  var search =$ ('#searchKey').val();
  //�˻� ��� �� ��ȯ ����ó �׸� ����Ʈ�� ����
 var contactFields = ['displayname','name','phoneNumbers','emails','addresses'];
  //�˻� �ɼ� ��ü�� ����
 var contactFieldOptions = {filter : search, multiple : true};
  //����ó Ž��
  navigator.contacts.find(contactFields,onContactSearchSuccess,onContactSearchError,contactFindOptions);
}

//��ü ����ó �˻�
function searchContactsAll(){
  var contactFields = ['displayname','name','phoneNumber','emails','addresses'];
  var contactFindOptions = { filter ; '', multiple : true };
  navigator.contacts.find(contactFields, oncontactSearchSuccess, onContactSearchError,contactFindOptions);
}

//�˻� ���� �ݹ� �Լ�
function onContactSearchSuccess(contacts) {
  var i , len, tagList='';
  contactList = contacts;  // ���� ��ü����
  len = contacts.length;
  if( len > 0) {
    tagList = '<ul data-role="listview" id="listview" data-inset="true" data-autodivider="true">';
    for ( i = 0, len; i < len, i += 1) {
      tagList += '<li><a onclick="displayContact(' + i + ');">' + contacts[i].displayName+ '</a></li>';
    }
    tagLitst += '</ul>';\$('#contactlistArea').childrem().list().replaceWith(tagList);
    $(document).bind('pagechange', function(){
      $('ui-page-active' : jqmData(role=content)').trigger('create');
    });
    $mobile.changePage('#contactListShowPage', 'slide', false,true);
  } else {
    navigator.notification.alert('�˻� ��� ����', null , '����ó �˻� ����');
  }
}

//�˻� ���� �ݹ� �Լ�
function contactSearchError(e){
  navigator.notification.alert(e.code, null, '����ó �˻� ����');
}