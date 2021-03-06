﻿//사진촬영
function takePhoto() {
navigator.camera.getPicture(onPhotoDataSuccess, OnFail,
  {quality:10, destinationType: Camera.DestinationType.DATA_URL,
   sourceType: Camera.PictureSourceType.CAMERA});
}
//사진촬영 성골콜백함수
function onPhotoDataSuccess(imageData){
  $('#displayArea').attr('src', 'data:image/jepg;base64,'+ imageData);
  $('h3').replaceWith($('<h3>촬영한 사진</p>'));
}

//사진 촬영 검색
function getPhoto(){
  navigator.camera.getPicture(onPhotoURISuccess, onFail,
                             {quality:50, destinationType:Camera.DstinationType,FILE_URI,
                             sourceType: Camera.PictureSourceType.PHOTOLIBRARY});
}

//사진검색 성공콜백함수
function onPhotoURISUCCess(imageURI){
  $('#displayArea').attr('src','imageURI');
  $('h3').replaceWith($('<h3>불러온 사진</h3>'));
}

//사진촬영/검색 실패콜백함수
function onFail(message){
  alert('실패'+ message);
}