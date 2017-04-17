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

import java.io.IOException;

final class MyJSONParser implements JSONParser {

  @Override
  //takes in a string, return an MyJson object
  public JSON parse(String in) throws IOException {
    
    //throws IOException -> As in, if not found or correct return an error?
    //creates a Json object that has a string to be checked and inputed into a new object, if this is not a valid jsonlite phrase,
    //then throw out an exception?
    
    // TODO: implement this
    return new MyJSON();
  }
}
