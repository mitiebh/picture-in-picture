# picture-in-picture
Picture In Picture feature practice in Android

## Guidline
After creating your project, first of all you should define the PictureInPicture feature in activity, by using that, add these two lines to your ```AndroidManifest.xml``` file.   
```
<activity 
    android:name=".MainActivity"
    android:supportsPictureInPicture="true"
    android:configChanges="screenSize|smallestScreenSize|screenLayout|orientation"
    ...
```
then implement this feature in your activity. 
