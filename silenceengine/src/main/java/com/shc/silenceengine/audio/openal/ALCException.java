/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 Sri Harsha Chilakapati
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.shc.silenceengine.audio.openal;

import com.shc.silenceengine.core.SilenceException;

/**
 * An exception class that represents a OpenAL Context error. This exception is a runtime exception.
 *
 * @author Sri Harsha Chilakapati
 * @author Josh "ShadowLordAlpha"
 */
public class ALCException extends SilenceException
{
    /**
     * Generated Serial UID
     */
    private static final long serialVersionUID = 4050123956884565895L;

    /**
     * Constructs the SilenceException with a message
     *
     * @param message The exception message
     */
    public ALCException(String message)
    {
        super(message);
    }

    public ALCException()
    {
    }

    public static class InvalidDevice extends ALCException
    {
        /**
         * Generated Serial UID
         */
        private static final long serialVersionUID = -6397053164061950829L;

        public InvalidDevice()
        {
            super("Invalid or no device selected");
        }
    }

    public static class InvalidContext extends ALCException
    {
        /**
         * Generated Serial UID
         */
        private static final long serialVersionUID = -5210291136725002116L;

        public InvalidContext()
        {
            super("Invalid or no context selected");
        }
    }

    public static class InvalidEnum extends ALCException
    {
        /**
         * Generated Serial UID
         */
        private static final long serialVersionUID = -8178672095266004322L;

        public InvalidEnum()
        {
            super("Invalid enum value");
        }
    }

    public static class InvalidValue extends ALCException
    {
        /**
         * Generated Serial UID
         */
        private static final long serialVersionUID = 5436212954534001608L;

        public InvalidValue()
        {
            super("Invalid parameter value");
        }
    }

    public static class OutOfMemory extends ALCException
    {
        /**
         * Generated Serial UID
         */
        private static final long serialVersionUID = 8145699586665590319L;

        public OutOfMemory()
        {
            super("OpenAL ran out of memory");
        }
    }
}
