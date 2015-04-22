/*
 * Copyright 2001-2014 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalactic

import org.scalatest._
import scala.collection.GenSeq
import scala.collection.GenMap
import scala.collection.GenSet
import scala.collection.GenIterable
import scala.collection.GenTraversable
import scala.collection.GenTraversableOnce

class CheckedEqualityCooperatingAnyValsSpec extends FunSpec with CheckedEquality {

  describe("The CheckedEquality trait") {
    it("should allow equality comparisons between types that co-operate in Scala") {

      val aChar: Char = 'c'
      val aByte: Byte = 99
      val aShort: Short = 99
      val anInt: Int = 99
      val aLong: Long = 99L
      val aFloat: Float = 99.0F
      val aDouble: Double = 99.0
      // SKIP-SCALATESTJS-START
      val aBigInt: BigInt = BigInt(99)
      val aBigDecimal: BigDecimal = BigDecimal(99.0)
      // SKIP-SCALATESTJS-END
      val aJavaCharacter: java.lang.Character = new java.lang.Character('c')
      val aJavaByte: java.lang.Byte = new java.lang.Byte(99.toByte)
      val aJavaShort: java.lang.Short = new java.lang.Short(99.toShort)
      val aJavaInteger: java.lang.Integer = new java.lang.Integer(99)
      val aJavaLong: java.lang.Long = new java.lang.Long(99L)
      val aJavaFloat: java.lang.Float = new java.lang.Float(99.0F)
      val aJavaDouble: java.lang.Double = new java.lang.Double(99.0)

      val aBoolean: Boolean = true
      val aJavaBoolean: java.lang.Boolean = new java.lang.Boolean(true)

      assert(aChar === aChar)
      assert(aChar === aByte)
      assert(aChar === aShort)
      assert(aChar === anInt)
      assert(aChar === aLong)
      assert(aChar === aFloat)
      assert(aChar === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aChar === aBigInt)
      assert(aChar === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aChar === aJavaCharacter)
      assert(aChar === aJavaByte)
      assert(aChar === aJavaShort)
      assert(aChar === aJavaInteger)
      assert(aChar === aJavaLong)
      assert(aChar === aJavaFloat)
      assert(aChar === aJavaDouble)

      assert(aByte === aChar)
      assert(aByte === aByte)
      assert(aByte === aShort)
      assert(aByte === anInt)
      assert(aByte === aLong)
      assert(aByte === aFloat)
      assert(aByte === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aByte === aBigInt)
      assert(aByte === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aByte === aJavaCharacter)
      assert(aByte === aJavaByte)
      assert(aByte === aJavaShort)
      assert(aByte === aJavaInteger)
      assert(aByte === aJavaLong)
      assert(aByte === aJavaFloat)
      assert(aByte === aJavaDouble)

      assert(aShort === aChar)
      assert(aShort === aByte)
      assert(aShort === aShort)
      assert(aShort === anInt)
      assert(aShort === aLong)
      assert(aShort === aFloat)
      assert(aShort === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aShort === aBigInt)
      assert(aShort === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aShort === aJavaCharacter)
      assert(aShort === aJavaByte)
      assert(aShort === aJavaShort)
      assert(aShort === aJavaInteger)
      assert(aShort === aJavaLong)
      assert(aShort === aJavaFloat)
      assert(aShort === aJavaDouble)

      assert(anInt === aChar)
      assert(anInt === aByte)
      assert(anInt === aShort)
      assert(anInt === anInt)
      assert(anInt === aLong)
      assert(anInt === aFloat)
      assert(anInt === aDouble)
      // SKIP-SCALATESTJS-START
      assert(anInt === aBigInt)
      assert(anInt === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(anInt === aJavaCharacter)
      assert(anInt === aJavaByte)
      assert(anInt === aJavaShort)
      assert(anInt === aJavaInteger)
      assert(anInt === aJavaLong)
      assert(anInt === aJavaFloat)
      assert(anInt === aJavaDouble)

      assert(aLong === aChar)
      assert(aLong === aByte)
      assert(aLong === aShort)
      assert(aLong === anInt)
      assert(aLong === aLong)
      assert(aLong === aFloat)
      assert(aLong === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aLong === aBigInt)
      assert(aLong === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aLong === aJavaCharacter)
      assert(aLong === aJavaByte)
      assert(aLong === aJavaShort)
      assert(aLong === aJavaInteger)
      assert(aLong === aJavaLong)
      assert(aLong === aJavaFloat)
      assert(aLong === aJavaDouble)

      assert(aFloat === aChar)
      assert(aFloat === aByte)
      assert(aFloat === aShort)
      assert(aFloat === anInt)
      assert(aFloat === aLong)
      assert(aFloat === aFloat)
      assert(aFloat === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aFloat === aBigInt)
      assert(aFloat === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aFloat === aJavaCharacter)
      assert(aFloat === aJavaByte)
      assert(aFloat === aJavaShort)
      assert(aFloat === aJavaInteger)
      assert(aFloat === aJavaLong)
      assert(aFloat === aJavaFloat)
      assert(aFloat === aJavaDouble)

      assert(aDouble === aChar)
      assert(aDouble === aByte)
      assert(aDouble === aShort)
      assert(aDouble === anInt)
      assert(aDouble === aLong)
      assert(aDouble === aFloat)
      assert(aDouble === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aDouble === aBigInt)
      assert(aDouble === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aDouble === aJavaCharacter)
      assert(aDouble === aJavaByte)
      assert(aDouble === aJavaShort)
      assert(aDouble === aJavaInteger)
      assert(aDouble === aJavaLong)
      assert(aDouble === aJavaFloat)
      assert(aDouble === aJavaDouble)

      // SKIP-SCALATESTJS-START
      assert(aBigInt === aChar)
      assert(aBigInt === aByte)
      assert(aBigInt === aShort)
      assert(aBigInt === anInt)
      assert(aBigInt === aLong)
      assert(aBigInt === aFloat)
      assert(aBigInt === aDouble)
      assert(aBigInt === aBigInt)
      assert(aBigInt === aBigDecimal)
      assert(aBigInt === aJavaCharacter)
      assert(aBigInt === aJavaByte)
      assert(aBigInt === aJavaShort)
      assert(aBigInt === aJavaInteger)
      assert(aBigInt === aJavaLong)
      assert(aBigInt === aJavaFloat)
      assert(aBigInt === aJavaDouble)

      assert(aBigDecimal === aChar)
      assert(aBigDecimal === aByte)
      assert(aBigDecimal === aShort)
      assert(aBigDecimal === anInt)
      assert(aBigDecimal === aLong)
      assert(aBigDecimal === aFloat)
      assert(aBigDecimal === aDouble)
      assert(aBigDecimal === aBigInt)
      assert(aBigDecimal === aBigDecimal)
      assert(aBigDecimal === aJavaCharacter)
      assert(aBigDecimal === aJavaByte)
      assert(aBigDecimal === aJavaShort)
      assert(aBigDecimal === aJavaInteger)
      assert(aBigDecimal === aJavaLong)
      assert(aBigDecimal === aJavaFloat)
      assert(aBigDecimal === aJavaDouble)
      // SKIP-SCALATESTJS-END

      assert(aJavaCharacter === aChar)
      assert(aJavaCharacter === aByte)
      assert(aJavaCharacter === aShort)
      assert(aJavaCharacter === anInt)
      assert(aJavaCharacter === aLong)
      assert(aJavaCharacter === aFloat)
      assert(aJavaCharacter === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aJavaCharacter === aBigInt)
      assert(aJavaCharacter === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aJavaCharacter === aJavaCharacter)
      assert(aJavaCharacter === aJavaByte)
      assert(aJavaCharacter === aJavaShort)
      assert(aJavaCharacter === aJavaInteger)
      assert(aJavaCharacter === aJavaLong)
      assert(aJavaCharacter === aJavaFloat)
      assert(aJavaCharacter === aJavaDouble)

      assert(aJavaByte === aChar)
      assert(aJavaByte === aByte)
      assert(aJavaByte === aShort)
      assert(aJavaByte === anInt)
      assert(aJavaByte === aLong)
      assert(aJavaByte === aFloat)
      assert(aJavaByte === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aJavaByte === aBigInt)
      assert(aJavaByte === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aJavaByte === aJavaCharacter)
      assert(aJavaByte === aJavaByte)
      assert(aJavaByte === aJavaShort)
      assert(aJavaByte === aJavaInteger)
      assert(aJavaByte === aJavaLong)
      assert(aJavaByte === aJavaFloat)
      assert(aJavaByte === aJavaDouble)

      assert(aJavaShort === aChar)
      assert(aJavaShort === aByte)
      assert(aJavaShort === aShort)
      assert(aJavaShort === anInt)
      assert(aJavaShort === aLong)
      assert(aJavaShort === aFloat)
      assert(aJavaShort === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aJavaShort === aBigInt)
      assert(aJavaShort === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aJavaShort === aJavaCharacter)
      assert(aJavaShort === aJavaByte)
      assert(aJavaShort === aJavaShort)
      assert(aJavaShort === aJavaInteger)
      assert(aJavaShort === aJavaLong)
      assert(aJavaShort === aJavaFloat)
      assert(aJavaShort === aJavaDouble)

      assert(aJavaInteger === aChar)
      assert(aJavaInteger === aByte)
      assert(aJavaInteger === aShort)
      assert(aJavaInteger === anInt)
      assert(aJavaInteger === aLong)
      assert(aJavaInteger === aFloat)
      assert(aJavaInteger === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aJavaInteger === aBigInt)
      assert(aJavaInteger === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aJavaInteger === aJavaCharacter)
      assert(aJavaInteger === aJavaByte)
      assert(aJavaInteger === aJavaShort)
      assert(aJavaInteger === aJavaInteger)
      assert(aJavaInteger === aJavaLong)
      assert(aJavaInteger === aJavaFloat)
      assert(aJavaInteger === aJavaDouble)

      assert(aJavaLong === aChar)
      assert(aJavaLong === aByte)
      assert(aJavaLong === aShort)
      assert(aJavaLong === anInt)
      assert(aJavaLong === aLong)
      assert(aJavaLong === aFloat)
      assert(aJavaLong === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aJavaLong === aBigInt)
      assert(aJavaLong === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aJavaLong === aJavaCharacter)
      assert(aJavaLong === aJavaByte)
      assert(aJavaLong === aJavaShort)
      assert(aJavaLong === aJavaInteger)
      assert(aJavaLong === aJavaLong)
      assert(aJavaLong === aJavaFloat)
      assert(aJavaLong === aJavaDouble)

      assert(aJavaFloat === aChar)
      assert(aJavaFloat === aByte)
      assert(aJavaFloat === aShort)
      assert(aJavaFloat === anInt)
      assert(aJavaFloat === aLong)
      assert(aJavaFloat === aFloat)
      assert(aJavaFloat === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aJavaFloat === aBigInt)
      assert(aJavaFloat === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aJavaFloat === aJavaCharacter)
      assert(aJavaFloat === aJavaByte)
      assert(aJavaFloat === aJavaShort)
      assert(aJavaFloat === aJavaInteger)
      assert(aJavaFloat === aJavaLong)
      assert(aJavaFloat === aJavaFloat)
      assert(aJavaFloat === aJavaDouble)

      assert(aJavaDouble === aChar)
      assert(aJavaDouble === aByte)
      assert(aJavaDouble === aShort)
      assert(aJavaDouble === anInt)
      assert(aJavaDouble === aLong)
      assert(aJavaDouble === aFloat)
      assert(aJavaDouble === aDouble)
      // SKIP-SCALATESTJS-START
      assert(aJavaDouble === aBigInt)
      assert(aJavaDouble === aBigDecimal)
      // SKIP-SCALATESTJS-END
      assert(aJavaDouble === aJavaCharacter)
      assert(aJavaDouble === aJavaByte)
      assert(aJavaDouble === aJavaShort)
      assert(aJavaDouble === aJavaInteger)
      assert(aJavaDouble === aJavaLong)
      assert(aJavaDouble === aJavaFloat)
      assert(aJavaDouble === aJavaDouble)

      assert(aBoolean === aBoolean)
      assert(aBoolean === aJavaBoolean)

      assert(aJavaBoolean === aJavaBoolean)
      assert(aJavaBoolean === aBoolean)
    }
  }
}

