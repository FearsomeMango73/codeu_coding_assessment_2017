// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;
import java.util.HashSet;


//JSON has the backbone to have these functions that changes between classes (doesnt matter how it connects, but makes connection (example) )
final class MyJSON implements JSON {
  
 // String[] parr;
  //Do you have to create a stack of these objects? Are you able to declare variables here?
  
  
  //I am unsure if i was able to edit outside the the TODO: implement code, so i did try to create an array
  //I was going to create a dynamic array or a stack of finishing this, but I was unusre of the values for it to be implemented
  //I also was trying to figure out how you would go about and only edit the functions and not add anything, 
  //this part was were i got confused, but still wanted to give my best shot with how i wouldve coded it using comments possibly
  

  @Override
  public JSON getObject(String name) {
    // TODO: implement this
    //Searches through the objects to find the matching name in the Object
    //returns the Object if found
    //returns null if nothing was found
  
    System.out.println("Checks to Get Object");
  
    return null;
  }

  @Override
  public JSON setObject(String name, JSON value) {
    
    //Need to check the values of the name to see if they coincide with the rules of JSON LITE
    //if they do, then create an object with JSON Value (Cannot find variable for this object?)
    
    // TODO: implement this
    // use the Json value and store the string into the obj
  //  parr = name.split("[.]");
  //  for( int i = 0; i < parr.length(); i++ ){
      //System.out.println(parr[i]); tests to see if the string was inputted correctly
  //  }
    //maybe a way to do this?
     // super(name, value);
    System.out.println("Check for Setting Object");
    return this;
  }

  @Override
  public String getString(String name) {
    // TODO: implement this
    
    //search the object for THE String it holds
    //returns the given string
    
   //   super(name);
    System.out.println("Check for Getting String");
    return null;
  }

  @Override
  public JSON setString(String name, String value) {
    // TODO: implement this
  //    super(name, value);
    
    //Check to see if proper json-lite string
    //if it is, continues, if not, return a throwback error
    //Checks for the Value within the Json objects
    //once found, replace string with new string
    //return the object
  
    System.out.println("Check for Setting String");
    return this;
  }

  @Override
  public void getObjects(Collection<String>//generics, I was starting to learn this from an upper classmen about type T(temple) This is really cool, but Im not confident with it yet
                         names) {
    // TODO: implement this
    
    //searches through the Collection of Type String to see if any of the objects match to any of the Strings
    //prints out an array of strings, or to see if theses are true or not
    //or Creates a new array of type Object to be returned that have th same string the Collection of type String
    
    //  super(names);
    
    System.out.println("Check for Getting Many Objects");
  }

  @Override
  public void getStrings(Collection<String> names) {
    // TODO: implement this
    //This seems more likely here as the functions is get STrings, not Objects
    //could also be to get the strings within the Object and reflect back the change of the new filled array of Collection of type String
    //  super(names);
       System.out.println("Check for Getting Many Strings");
  }
}
