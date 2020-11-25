function init() {
  //地図表示(デフォルト設定)

  //初期表示位置(現在位置の表示がほとんどになるため実際使うことはあまりない)
  var mymap = L.map('mapid').setView([35.7102, 139.8132], 15);
 
  L.tileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png', {
 　　　　maxZoom: 18,
 　　　　attribution: 'Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors, '
 　　}).addTo(mymap);

  var searchLayer = new L.LayerGroup();
  mymap.addLayer(searchLayer);

  var controlSearch = new L.Control.Search({
 　　　　position:'topright',
 　　　　layer: searchLayer,
 　　　　initial: false,
 　　　　zoom: 15,
 　　　　　marker: false
 　　});
  mymap.addControl( controlSearch );

  var data = [
   {"loc":[35.7101, 139.8107], "title":"タイトル1", "description":"説明１"},
   {"loc":[35.7121, 139.8207], "title":"タイトル2", "description":"説明２"},
   {"loc":[35.7091, 139.8207], "title":"タイトル3", "description":"説明３"}
 　];

  for(i in data) {
   loc = data[i].loc,
   marker = new L.Marker(new L.latLng(loc), {title: title} );
   marker.bindPopup('title: '+ title );
   searchLayer.addLayer(marker);
 }

      }
    