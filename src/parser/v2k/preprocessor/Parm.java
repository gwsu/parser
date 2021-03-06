//The MIT License
//
//Copyright (c) 2006-2010  Karl W. Pfalzer
//Copyright (c) 2011-      George P. Burdell
//
//Permission is hereby granted, free of charge, to any person obtaining a copy
//of this software and associated documentation files (the "Software"), to deal
//in the Software without restriction, including without limitation the rights
//to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//copies of the Software, and to permit persons to whom the Software is
//furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in
//all copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
//THE SOFTWARE.
package parser.v2k.preprocessor;
import  java.util.*;
import  parser.Pair;

/**
 * A parameter name and its default value.
 * 
 * @author kpfalzer
 */
public class Parm extends Pair<String,String> {
    static List<Parm> createList() {
        return new LinkedList<Parm>();
    }
    Parm(String parm) {
        super(parm,null);
    }

    void setDefault(String dflt) {
        super.v2 = dflt;
    }

    String getParmName() {
        return v1;
    }

    String getDefault() {
        return v2;
    }

    boolean hasDefault() {
        return (null != getDefault());
    }
}
