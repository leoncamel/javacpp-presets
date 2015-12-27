// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;

public class opencv_imgproc extends org.bytedeco.javacpp.helper.opencv_imgproc {
    static { Loader.load(); }

// Parsed from <opencv2/imgproc/types_c.h>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_IMGPROC_TYPES_C_H__
// #define __OPENCV_IMGPROC_TYPES_C_H__

// #include "opencv2/core/core_c.h"

// #ifdef __cplusplus
// #endif

/** \addtogroup imgproc_c
  \{
*/

/** Connected component structure */
public static class CvConnectedComp extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvConnectedComp() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvConnectedComp(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvConnectedComp(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvConnectedComp position(int position) {
        return (CvConnectedComp)super.position(position);
    }

    /**area of the connected component  */
    public native double area(); public native CvConnectedComp area(double area);
    /**average color of the connected component */
    public native @ByRef CvScalar value(); public native CvConnectedComp value(CvScalar value);
    /**ROI of the component  */
    public native @ByRef CvRect rect(); public native CvConnectedComp rect(CvRect rect);
    /**optional component boundary
                          (the contour might have child contours corresponding to the holes)*/
    public native CvSeq contour(); public native CvConnectedComp contour(CvSeq contour);
}

/** Image smooth methods */
/** enum SmoothMethod_c */
public static final int
    /** linear convolution with \f$\texttt{size1}\times\texttt{size2}\f$ box kernel (all 1's). If
    you want to smooth different pixels with different-size box kernels, you can use the integral
    image that is computed using integral */
    CV_BLUR_NO_SCALE = 0,
    /** linear convolution with \f$\texttt{size1}\times\texttt{size2}\f$ box kernel (all
    1's) with subsequent scaling by \f$1/(\texttt{size1}\cdot\texttt{size2})\f$ */
    CV_BLUR  = 1,
    /** linear convolution with a \f$\texttt{size1}\times\texttt{size2}\f$ Gaussian kernel */
    CV_GAUSSIAN  = 2,
    /** median filter with a \f$\texttt{size1}\times\texttt{size1}\f$ square aperture */
    CV_MEDIAN = 3,
    /** bilateral filter with a \f$\texttt{size1}\times\texttt{size1}\f$ square aperture, color
    sigma= sigma1 and spatial sigma= sigma2. If size1=0, the aperture square side is set to
    cvRound(sigma2\*1.5)\*2+1. See cv::bilateralFilter */
    CV_BILATERAL = 4;

/** Filters used in pyramid decomposition */
/** enum  */
public static final int
    CV_GAUSSIAN_5x5 = 7;

/** Special filters */
/** enum  */
public static final int
    CV_SCHARR = -1,
    CV_MAX_SOBEL_KSIZE = 7;

/** Constants for color conversion */
/** enum  */
public static final int
    CV_BGR2BGRA    = 0,
    CV_RGB2RGBA    = CV_BGR2BGRA,

    CV_BGRA2BGR    = 1,
    CV_RGBA2RGB    = CV_BGRA2BGR,

    CV_BGR2RGBA    = 2,
    CV_RGB2BGRA    = CV_BGR2RGBA,

    CV_RGBA2BGR    = 3,
    CV_BGRA2RGB    = CV_RGBA2BGR,

    CV_BGR2RGB     = 4,
    CV_RGB2BGR     = CV_BGR2RGB,

    CV_BGRA2RGBA   = 5,
    CV_RGBA2BGRA   = CV_BGRA2RGBA,

    CV_BGR2GRAY    = 6,
    CV_RGB2GRAY    = 7,
    CV_GRAY2BGR    = 8,
    CV_GRAY2RGB    = CV_GRAY2BGR,
    CV_GRAY2BGRA   = 9,
    CV_GRAY2RGBA   = CV_GRAY2BGRA,
    CV_BGRA2GRAY   = 10,
    CV_RGBA2GRAY   = 11,

    CV_BGR2BGR565  = 12,
    CV_RGB2BGR565  = 13,
    CV_BGR5652BGR  = 14,
    CV_BGR5652RGB  = 15,
    CV_BGRA2BGR565 = 16,
    CV_RGBA2BGR565 = 17,
    CV_BGR5652BGRA = 18,
    CV_BGR5652RGBA = 19,

    CV_GRAY2BGR565 = 20,
    CV_BGR5652GRAY = 21,

    CV_BGR2BGR555  = 22,
    CV_RGB2BGR555  = 23,
    CV_BGR5552BGR  = 24,
    CV_BGR5552RGB  = 25,
    CV_BGRA2BGR555 = 26,
    CV_RGBA2BGR555 = 27,
    CV_BGR5552BGRA = 28,
    CV_BGR5552RGBA = 29,

    CV_GRAY2BGR555 = 30,
    CV_BGR5552GRAY = 31,

    CV_BGR2XYZ     = 32,
    CV_RGB2XYZ     = 33,
    CV_XYZ2BGR     = 34,
    CV_XYZ2RGB     = 35,

    CV_BGR2YCrCb   = 36,
    CV_RGB2YCrCb   = 37,
    CV_YCrCb2BGR   = 38,
    CV_YCrCb2RGB   = 39,

    CV_BGR2HSV     = 40,
    CV_RGB2HSV     = 41,

    CV_BGR2Lab     = 44,
    CV_RGB2Lab     = 45,

    CV_BayerBG2BGR = 46,
    CV_BayerGB2BGR = 47,
    CV_BayerRG2BGR = 48,
    CV_BayerGR2BGR = 49,

    CV_BayerBG2RGB = CV_BayerRG2BGR,
    CV_BayerGB2RGB = CV_BayerGR2BGR,
    CV_BayerRG2RGB = CV_BayerBG2BGR,
    CV_BayerGR2RGB = CV_BayerGB2BGR,

    CV_BGR2Luv     = 50,
    CV_RGB2Luv     = 51,
    CV_BGR2HLS     = 52,
    CV_RGB2HLS     = 53,

    CV_HSV2BGR     = 54,
    CV_HSV2RGB     = 55,

    CV_Lab2BGR     = 56,
    CV_Lab2RGB     = 57,
    CV_Luv2BGR     = 58,
    CV_Luv2RGB     = 59,
    CV_HLS2BGR     = 60,
    CV_HLS2RGB     = 61,

    CV_BayerBG2BGR_VNG = 62,
    CV_BayerGB2BGR_VNG = 63,
    CV_BayerRG2BGR_VNG = 64,
    CV_BayerGR2BGR_VNG = 65,

    CV_BayerBG2RGB_VNG = CV_BayerRG2BGR_VNG,
    CV_BayerGB2RGB_VNG = CV_BayerGR2BGR_VNG,
    CV_BayerRG2RGB_VNG = CV_BayerBG2BGR_VNG,
    CV_BayerGR2RGB_VNG = CV_BayerGB2BGR_VNG,

    CV_BGR2HSV_FULL = 66,
    CV_RGB2HSV_FULL = 67,
    CV_BGR2HLS_FULL = 68,
    CV_RGB2HLS_FULL = 69,

    CV_HSV2BGR_FULL = 70,
    CV_HSV2RGB_FULL = 71,
    CV_HLS2BGR_FULL = 72,
    CV_HLS2RGB_FULL = 73,

    CV_LBGR2Lab     = 74,
    CV_LRGB2Lab     = 75,
    CV_LBGR2Luv     = 76,
    CV_LRGB2Luv     = 77,

    CV_Lab2LBGR     = 78,
    CV_Lab2LRGB     = 79,
    CV_Luv2LBGR     = 80,
    CV_Luv2LRGB     = 81,

    CV_BGR2YUV      = 82,
    CV_RGB2YUV      = 83,
    CV_YUV2BGR      = 84,
    CV_YUV2RGB      = 85,

    CV_BayerBG2GRAY = 86,
    CV_BayerGB2GRAY = 87,
    CV_BayerRG2GRAY = 88,
    CV_BayerGR2GRAY = 89,

    //YUV 4:2:0 formats family
    CV_YUV2RGB_NV12 = 90,
    CV_YUV2BGR_NV12 = 91,
    CV_YUV2RGB_NV21 = 92,
    CV_YUV2BGR_NV21 = 93,
    CV_YUV420sp2RGB =  CV_YUV2RGB_NV21,
    CV_YUV420sp2BGR =  CV_YUV2BGR_NV21,

    CV_YUV2RGBA_NV12 = 94,
    CV_YUV2BGRA_NV12 = 95,
    CV_YUV2RGBA_NV21 = 96,
    CV_YUV2BGRA_NV21 = 97,
    CV_YUV420sp2RGBA =  CV_YUV2RGBA_NV21,
    CV_YUV420sp2BGRA =  CV_YUV2BGRA_NV21,

    CV_YUV2RGB_YV12 = 98,
    CV_YUV2BGR_YV12 = 99,
    CV_YUV2RGB_IYUV = 100,
    CV_YUV2BGR_IYUV = 101,
    CV_YUV2RGB_I420 =  CV_YUV2RGB_IYUV,
    CV_YUV2BGR_I420 =  CV_YUV2BGR_IYUV,
    CV_YUV420p2RGB =  CV_YUV2RGB_YV12,
    CV_YUV420p2BGR =  CV_YUV2BGR_YV12,

    CV_YUV2RGBA_YV12 = 102,
    CV_YUV2BGRA_YV12 = 103,
    CV_YUV2RGBA_IYUV = 104,
    CV_YUV2BGRA_IYUV = 105,
    CV_YUV2RGBA_I420 =  CV_YUV2RGBA_IYUV,
    CV_YUV2BGRA_I420 =  CV_YUV2BGRA_IYUV,
    CV_YUV420p2RGBA =  CV_YUV2RGBA_YV12,
    CV_YUV420p2BGRA =  CV_YUV2BGRA_YV12,

    CV_YUV2GRAY_420 = 106,
    CV_YUV2GRAY_NV21 =  CV_YUV2GRAY_420,
    CV_YUV2GRAY_NV12 =  CV_YUV2GRAY_420,
    CV_YUV2GRAY_YV12 =  CV_YUV2GRAY_420,
    CV_YUV2GRAY_IYUV =  CV_YUV2GRAY_420,
    CV_YUV2GRAY_I420 =  CV_YUV2GRAY_420,
    CV_YUV420sp2GRAY =  CV_YUV2GRAY_420,
    CV_YUV420p2GRAY =  CV_YUV2GRAY_420,

    //YUV 4:2:2 formats family
    CV_YUV2RGB_UYVY = 107,
    CV_YUV2BGR_UYVY = 108,
    //CV_YUV2RGB_VYUY = 109,
    //CV_YUV2BGR_VYUY = 110,
    CV_YUV2RGB_Y422 =  CV_YUV2RGB_UYVY,
    CV_YUV2BGR_Y422 =  CV_YUV2BGR_UYVY,
    CV_YUV2RGB_UYNV =  CV_YUV2RGB_UYVY,
    CV_YUV2BGR_UYNV =  CV_YUV2BGR_UYVY,

    CV_YUV2RGBA_UYVY = 111,
    CV_YUV2BGRA_UYVY = 112,
    //CV_YUV2RGBA_VYUY = 113,
    //CV_YUV2BGRA_VYUY = 114,
    CV_YUV2RGBA_Y422 =  CV_YUV2RGBA_UYVY,
    CV_YUV2BGRA_Y422 =  CV_YUV2BGRA_UYVY,
    CV_YUV2RGBA_UYNV =  CV_YUV2RGBA_UYVY,
    CV_YUV2BGRA_UYNV =  CV_YUV2BGRA_UYVY,

    CV_YUV2RGB_YUY2 = 115,
    CV_YUV2BGR_YUY2 = 116,
    CV_YUV2RGB_YVYU = 117,
    CV_YUV2BGR_YVYU = 118,
    CV_YUV2RGB_YUYV =  CV_YUV2RGB_YUY2,
    CV_YUV2BGR_YUYV =  CV_YUV2BGR_YUY2,
    CV_YUV2RGB_YUNV =  CV_YUV2RGB_YUY2,
    CV_YUV2BGR_YUNV =  CV_YUV2BGR_YUY2,

    CV_YUV2RGBA_YUY2 = 119,
    CV_YUV2BGRA_YUY2 = 120,
    CV_YUV2RGBA_YVYU = 121,
    CV_YUV2BGRA_YVYU = 122,
    CV_YUV2RGBA_YUYV =  CV_YUV2RGBA_YUY2,
    CV_YUV2BGRA_YUYV =  CV_YUV2BGRA_YUY2,
    CV_YUV2RGBA_YUNV =  CV_YUV2RGBA_YUY2,
    CV_YUV2BGRA_YUNV =  CV_YUV2BGRA_YUY2,

    CV_YUV2GRAY_UYVY = 123,
    CV_YUV2GRAY_YUY2 = 124,
    //CV_YUV2GRAY_VYUY = CV_YUV2GRAY_UYVY,
    CV_YUV2GRAY_Y422 =  CV_YUV2GRAY_UYVY,
    CV_YUV2GRAY_UYNV =  CV_YUV2GRAY_UYVY,
    CV_YUV2GRAY_YVYU =  CV_YUV2GRAY_YUY2,
    CV_YUV2GRAY_YUYV =  CV_YUV2GRAY_YUY2,
    CV_YUV2GRAY_YUNV =  CV_YUV2GRAY_YUY2,

    // alpha premultiplication
    CV_RGBA2mRGBA = 125,
    CV_mRGBA2RGBA = 126,

    CV_RGB2YUV_I420 = 127,
    CV_BGR2YUV_I420 = 128,
    CV_RGB2YUV_IYUV =  CV_RGB2YUV_I420,
    CV_BGR2YUV_IYUV =  CV_BGR2YUV_I420,

    CV_RGBA2YUV_I420 = 129,
    CV_BGRA2YUV_I420 = 130,
    CV_RGBA2YUV_IYUV =  CV_RGBA2YUV_I420,
    CV_BGRA2YUV_IYUV =  CV_BGRA2YUV_I420,
    CV_RGB2YUV_YV12  = 131,
    CV_BGR2YUV_YV12  = 132,
    CV_RGBA2YUV_YV12 = 133,
    CV_BGRA2YUV_YV12 = 134,

    // Edge-Aware Demosaicing
    CV_BayerBG2BGR_EA = 135,
    CV_BayerGB2BGR_EA = 136,
    CV_BayerRG2BGR_EA = 137,
    CV_BayerGR2BGR_EA = 138,

    CV_BayerBG2RGB_EA =  CV_BayerRG2BGR_EA,
    CV_BayerGB2RGB_EA =  CV_BayerGR2BGR_EA,
    CV_BayerRG2RGB_EA =  CV_BayerBG2BGR_EA,
    CV_BayerGR2RGB_EA =  CV_BayerGB2BGR_EA,

    CV_COLORCVT_MAX  = 139;


/** Sub-pixel interpolation methods */
/** enum  */
public static final int
    CV_INTER_NN        = 0,
    CV_INTER_LINEAR    = 1,
    CV_INTER_CUBIC     = 2,
    CV_INTER_AREA      = 3,
    CV_INTER_LANCZOS4  = 4;

/** ... and other image warping flags */
/** enum  */
public static final int
    CV_WARP_FILL_OUTLIERS = 8,
    CV_WARP_INVERSE_MAP  = 16;

/** Shapes of a structuring element for morphological operations
@see cv::MorphShapes, cv::getStructuringElement
*/
/** enum MorphShapes_c */
public static final int
    CV_SHAPE_RECT      = 0,
    CV_SHAPE_CROSS     = 1,
    CV_SHAPE_ELLIPSE   = 2,
    /** custom structuring element */
    CV_SHAPE_CUSTOM    = 100;

/** Morphological operations */
/** enum  */
public static final int
    CV_MOP_ERODE        = 0,
    CV_MOP_DILATE       = 1,
    CV_MOP_OPEN         = 2,
    CV_MOP_CLOSE        = 3,
    CV_MOP_GRADIENT     = 4,
    CV_MOP_TOPHAT       = 5,
    CV_MOP_BLACKHAT     = 6;

/** Spatial and central moments */
@NoOffset public static class CvMoments extends AbstractCvMoments {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMoments(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvMoments(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CvMoments position(int position) {
        return (CvMoments)super.position(position);
    }

    /** spatial moments */
    public native double m00(); public native CvMoments m00(double m00);
    public native double m10(); public native CvMoments m10(double m10);
    public native double m01(); public native CvMoments m01(double m01);
    public native double m20(); public native CvMoments m20(double m20);
    public native double m11(); public native CvMoments m11(double m11);
    public native double m02(); public native CvMoments m02(double m02);
    public native double m30(); public native CvMoments m30(double m30);
    public native double m21(); public native CvMoments m21(double m21);
    public native double m12(); public native CvMoments m12(double m12);
    public native double m03(); public native CvMoments m03(double m03);
    /** central moments */
    public native double mu20(); public native CvMoments mu20(double mu20);
    public native double mu11(); public native CvMoments mu11(double mu11);
    public native double mu02(); public native CvMoments mu02(double mu02);
    public native double mu30(); public native CvMoments mu30(double mu30);
    public native double mu21(); public native CvMoments mu21(double mu21);
    public native double mu12(); public native CvMoments mu12(double mu12);
    public native double mu03(); public native CvMoments mu03(double mu03);
    /** m00 != 0 ? 1/sqrt(m00) : 0 */
    public native double inv_sqrt_m00(); public native CvMoments inv_sqrt_m00(double inv_sqrt_m00);

// #ifdef __cplusplus
    public CvMoments() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvMoments(@Const @ByRef Moments m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef Moments m);
    public native @ByVal @Name("operator cv::Moments") Moments asMoments();
// #endif
}

/** Hu invariants */
public static class CvHuMoments extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvHuMoments() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvHuMoments(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvHuMoments(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvHuMoments position(int position) {
        return (CvHuMoments)super.position(position);
    }

    /** Hu invariants */
    public native double hu1(); public native CvHuMoments hu1(double hu1);
    public native double hu2(); public native CvHuMoments hu2(double hu2);
    public native double hu3(); public native CvHuMoments hu3(double hu3);
    public native double hu4(); public native CvHuMoments hu4(double hu4);
    public native double hu5(); public native CvHuMoments hu5(double hu5);
    public native double hu6(); public native CvHuMoments hu6(double hu6);
    public native double hu7(); public native CvHuMoments hu7(double hu7);
}

/** Template matching methods */
/** enum  */
public static final int
    CV_TM_SQDIFF        = 0,
    CV_TM_SQDIFF_NORMED = 1,
    CV_TM_CCORR         = 2,
    CV_TM_CCORR_NORMED  = 3,
    CV_TM_CCOEFF        = 4,
    CV_TM_CCOEFF_NORMED = 5;

@Convention("CV_CDECL") public static class CvDistanceFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CvDistanceFunction(Pointer p) { super(p); }
    protected CvDistanceFunction() { allocate(); }
    private native void allocate();
    public native float call( @Const FloatPointer a, @Const FloatPointer b, Pointer user_param );
}

/** Contour retrieval modes */
/** enum  */
public static final int
    CV_RETR_EXTERNAL= 0,
    CV_RETR_LIST= 1,
    CV_RETR_CCOMP= 2,
    CV_RETR_TREE= 3,
    CV_RETR_FLOODFILL= 4;

/** Contour approximation methods */
/** enum  */
public static final int
    CV_CHAIN_CODE= 0,
    CV_CHAIN_APPROX_NONE= 1,
    CV_CHAIN_APPROX_SIMPLE= 2,
    CV_CHAIN_APPROX_TC89_L1= 3,
    CV_CHAIN_APPROX_TC89_KCOS= 4,
    CV_LINK_RUNS= 5;

/*
Internal structure that is used for sequential retrieving contours from the image.
It supports both hierarchical and plane variants of Suzuki algorithm.
*/
@Name("_CvContourScanner") @Opaque public static class CvContourScanner extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CvContourScanner() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvContourScanner(Pointer p) { super(p); }
}

/** Freeman chain reader state */
public static class CvChainPtReader extends CvSeqReader {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvChainPtReader() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvChainPtReader(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvChainPtReader(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvChainPtReader position(int position) {
        return (CvChainPtReader)super.position(position);
    }

    public native int header_size(); public native CvChainPtReader header_size(int header_size);
    /** sequence, beign read */
    public native CvSeq seq(); public native CvChainPtReader seq(CvSeq seq);
    /** current block */
    public native CvSeqBlock block(); public native CvChainPtReader block(CvSeqBlock block);
    /** pointer to element be read next */
    public native @Cast("schar*") BytePointer ptr(); public native CvChainPtReader ptr(BytePointer ptr);
    /** pointer to the beginning of block */
    public native @Cast("schar*") BytePointer block_min(); public native CvChainPtReader block_min(BytePointer block_min);
    /** pointer to the end of block */
    public native @Cast("schar*") BytePointer block_max(); public native CvChainPtReader block_max(BytePointer block_max);
    /** = seq->first->start_index   */
    public native int delta_index(); public native CvChainPtReader delta_index(int delta_index);
    /** pointer to previous element */
    public native @Cast("schar*") BytePointer prev_elem(); public native CvChainPtReader prev_elem(BytePointer prev_elem);
    public native @Cast("char") byte code(); public native CvChainPtReader code(byte code);
    public native @ByRef CvPoint pt(); public native CvChainPtReader pt(CvPoint pt);
    public native @Cast("schar") byte deltas(int i, int j); public native CvChainPtReader deltas(int i, int j, byte deltas);
    @MemberGetter public native @Cast("schar(*)[2]") BytePointer deltas();
}

/** initializes 8-element array for fast access to 3x3 neighborhood of a pixel */
// #define  CV_INIT_3X3_DELTAS( deltas, step, nch )
//     ((deltas)[0] =  (nch),  (deltas)[1] = -(step) + (nch),
//      (deltas)[2] = -(step), (deltas)[3] = -(step) - (nch),
//      (deltas)[4] = -(nch),  (deltas)[5] =  (step) - (nch),
//      (deltas)[6] =  (step), (deltas)[7] =  (step) + (nch))


/** Contour approximation algorithms */
/** enum  */
public static final int
    CV_POLY_APPROX_DP = 0;

/** \brief Shape matching methods
<p>
\f$A\f$ denotes object1,\f$B\f$ denotes object2
<p>
\f$\begin{array}{l} m^A_i =  \mathrm{sign} (h^A_i)  \cdot \log{h^A_i} \\ m^B_i =  \mathrm{sign} (h^B_i)  \cdot \log{h^B_i} \end{array}\f$
<p>
and \f$h^A_i, h^B_i\f$ are the Hu moments of \f$A\f$ and \f$B\f$ , respectively.
*/
/** enum ShapeMatchModes */
public static final int
    /** \f[I_1(A,B) =  \sum _{i=1...7}  \left |  \frac{1}{m^A_i} -  \frac{1}{m^B_i} \right |\f] */
    CV_CONTOURS_MATCH_I1  = 1,
    /** \f[I_2(A,B) =  \sum _{i=1...7}  \left | m^A_i - m^B_i  \right |\f] */
    CV_CONTOURS_MATCH_I2  = 2,
    /** \f[I_3(A,B) =  \max _{i=1...7}  \frac{ \left| m^A_i - m^B_i \right| }{ \left| m^A_i \right| }\f] */
    CV_CONTOURS_MATCH_I3  = 3;

/** Shape orientation */
/** enum  */
public static final int
    CV_CLOCKWISE         = 1,
    CV_COUNTER_CLOCKWISE = 2;


/** Convexity defect */
public static class CvConvexityDefect extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvConvexityDefect() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvConvexityDefect(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvConvexityDefect(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvConvexityDefect position(int position) {
        return (CvConvexityDefect)super.position(position);
    }

    /** point of the contour where the defect begins */
    public native CvPoint start(); public native CvConvexityDefect start(CvPoint start);
    /** point of the contour where the defect ends */
    public native CvPoint end(); public native CvConvexityDefect end(CvPoint end);
    /** the farthest from the convex hull point within the defect */
    public native CvPoint depth_point(); public native CvConvexityDefect depth_point(CvPoint depth_point);
    /** distance between the farthest point and the convex hull */
    public native float depth(); public native CvConvexityDefect depth(float depth);
}


/** Histogram comparison methods */
/** enum  */
public static final int
    CV_COMP_CORREL        = 0,
    CV_COMP_CHISQR        = 1,
    CV_COMP_INTERSECT     = 2,
    CV_COMP_BHATTACHARYYA = 3,
    CV_COMP_HELLINGER     = CV_COMP_BHATTACHARYYA,
    CV_COMP_CHISQR_ALT    = 4,
    CV_COMP_KL_DIV        = 5;

/** Mask size for distance transform */
/** enum  */
public static final int
    CV_DIST_MASK_3   = 3,
    CV_DIST_MASK_5   = 5,
    CV_DIST_MASK_PRECISE = 0;

/** Content of output label array: connected components or pixels */
/** enum  */
public static final int
  CV_DIST_LABEL_CCOMP = 0,
  CV_DIST_LABEL_PIXEL = 1;

/** Distance types for Distance Transform and M-estimators */
/** enum  */
public static final int
    /** User defined distance */
    CV_DIST_USER    = -1,
    /** distance = |x1-x2| + |y1-y2| */
    CV_DIST_L1      = 1,
    /** the simple euclidean distance */
    CV_DIST_L2      = 2,
    /** distance = max(|x1-x2|,|y1-y2|) */
    CV_DIST_C       = 3,
    /** L1-L2 metric: distance = 2(sqrt(1+x*x/2) - 1)) */
    CV_DIST_L12     = 4,
    /** distance = c^2(|x|/c-log(1+|x|/c)), c = 1.3998 */
    CV_DIST_FAIR    = 5,
    /** distance = c^2/2(1-exp(-(x/c)^2)), c = 2.9846 */
    CV_DIST_WELSCH  = 6,
    /** distance = |x|<c ? x^2/2 : c(|x|-c/2), c=1.345 */
    CV_DIST_HUBER   = 7;


/** Threshold types */
/** enum  */
public static final int
    /** value = value > threshold ? max_value : 0       */
    CV_THRESH_BINARY      = 0,
    /** value = value > threshold ? 0 : max_value       */
    CV_THRESH_BINARY_INV  = 1,
    /** value = value > threshold ? threshold : value   */
    CV_THRESH_TRUNC       = 2,
    /** value = value > threshold ? value : 0           */
    CV_THRESH_TOZERO      = 3,
    /** value = value > threshold ? 0 : value           */
    CV_THRESH_TOZERO_INV  = 4,
    CV_THRESH_MASK        = 7,
    /** use Otsu algorithm to choose the optimal threshold value;
                                 combine the flag with one of the above CV_THRESH_* values */
    CV_THRESH_OTSU        = 8,
    /** use Triangle algorithm to choose the optimal threshold value;
                                 combine the flag with one of the above CV_THRESH_* values, but not
                                 with CV_THRESH_OTSU */
    CV_THRESH_TRIANGLE    = 16;

/** Adaptive threshold methods */
/** enum  */
public static final int
    CV_ADAPTIVE_THRESH_MEAN_C  = 0,
    CV_ADAPTIVE_THRESH_GAUSSIAN_C  = 1;

/** FloodFill flags */
/** enum  */
public static final int
    CV_FLOODFILL_FIXED_RANGE = (1 << 16),
    CV_FLOODFILL_MASK_ONLY   = (1 << 17);


/** Canny edge detector flags */
/** enum  */
public static final int
    CV_CANNY_L2_GRADIENT  = (1 << 31);

/** Variants of a Hough transform */
/** enum  */
public static final int
    CV_HOUGH_STANDARD = 0,
    CV_HOUGH_PROBABILISTIC = 1,
    CV_HOUGH_MULTI_SCALE = 2,
    CV_HOUGH_GRADIENT = 3;


/* Fast search data structures  */
@Opaque public static class CvFeatureTree extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CvFeatureTree() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvFeatureTree(Pointer p) { super(p); }
}
@Opaque public static class CvLSH extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CvLSH() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvLSH(Pointer p) { super(p); }
}
@Opaque public static class CvLSHOperations extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CvLSHOperations() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvLSHOperations(Pointer p) { super(p); }
}

/** \} */

// #ifdef __cplusplus
// #endif

// #endif


// Parsed from <opencv2/imgproc/imgproc_c.h>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_IMGPROC_IMGPROC_C_H__
// #define __OPENCV_IMGPROC_IMGPROC_C_H__

// #include "opencv2/imgproc/types_c.h"

// #ifdef __cplusplus
// #endif

/** \addtogroup imgproc_c
\{
*/

/*********************** Background statistics accumulation *****************************/

/** \brief Adds image to accumulator
@see cv::accumulate
*/
public static native void cvAcc( @Const CvArr image, CvArr sum,
                   @Const CvArr mask/*=NULL*/ );
public static native void cvAcc( @Const CvArr image, CvArr sum );

/** \brief Adds squared image to accumulator
@see cv::accumulateSquare
*/
public static native void cvSquareAcc( @Const CvArr image, CvArr sqsum,
                         @Const CvArr mask/*=NULL*/ );
public static native void cvSquareAcc( @Const CvArr image, CvArr sqsum );

/** \brief Adds a product of two images to accumulator
@see cv::accumulateProduct
*/
public static native void cvMultiplyAcc( @Const CvArr image1, @Const CvArr image2, CvArr acc,
                           @Const CvArr mask/*=NULL*/ );
public static native void cvMultiplyAcc( @Const CvArr image1, @Const CvArr image2, CvArr acc );

/** \brief Adds image to accumulator with weights: acc = acc*(1-alpha) + image*alpha
@see cv::accumulateWeighted
*/
public static native void cvRunningAvg( @Const CvArr image, CvArr acc, double alpha,
                          @Const CvArr mask/*=NULL*/ );
public static native void cvRunningAvg( @Const CvArr image, CvArr acc, double alpha );

/****************************************************************************************\
*                                    Image Processing                                    *
\****************************************************************************************/

/** Copies source 2D array inside of the larger destination array and
   makes a border of the specified type (IPL_BORDER_*) around the copied area. */
public static native void cvCopyMakeBorder( @Const CvArr src, CvArr dst, @ByVal CvPoint offset,
                              int bordertype, @ByVal(nullValue = "cvScalarAll(0)") CvScalar value/*=cvScalarAll(0)*/);
public static native void cvCopyMakeBorder( @Const CvArr src, CvArr dst, @ByVal CvPoint offset,
                              int bordertype);
public static native void cvCopyMakeBorder( @Const CvArr src, CvArr dst, @ByVal @Cast("CvPoint*") IntBuffer offset,
                              int bordertype, @ByVal(nullValue = "cvScalarAll(0)") CvScalar value/*=cvScalarAll(0)*/);
public static native void cvCopyMakeBorder( @Const CvArr src, CvArr dst, @ByVal @Cast("CvPoint*") IntBuffer offset,
                              int bordertype);
public static native void cvCopyMakeBorder( @Const CvArr src, CvArr dst, @ByVal @Cast("CvPoint*") int[] offset,
                              int bordertype, @ByVal(nullValue = "cvScalarAll(0)") CvScalar value/*=cvScalarAll(0)*/);
public static native void cvCopyMakeBorder( @Const CvArr src, CvArr dst, @ByVal @Cast("CvPoint*") int[] offset,
                              int bordertype);

/** \brief Smooths the image in one of several ways.
<p>
@param src The source image
@param dst The destination image
@param smoothtype Type of the smoothing, see SmoothMethod_c
@param size1 The first parameter of the smoothing operation, the aperture width. Must be a
positive odd number (1, 3, 5, ...)
@param size2 The second parameter of the smoothing operation, the aperture height. Ignored by
CV_MEDIAN and CV_BILATERAL methods. In the case of simple scaled/non-scaled and Gaussian blur if
size2 is zero, it is set to size1. Otherwise it must be a positive odd number.
@param sigma1 In the case of a Gaussian parameter this parameter may specify Gaussian \f$\sigma\f$
(standard deviation). If it is zero, it is calculated from the kernel size:
\f[\sigma  = 0.3 (n/2 - 1) + 0.8  \quad   \text{where}   \quad  n= \begin{array}{l l} \mbox{\texttt{size1} for horizontal kernel} \\ \mbox{\texttt{size2} for vertical kernel} \end{array}\f]
Using standard sigma for small kernels ( \f$3\times 3\f$ to \f$7\times 7\f$ ) gives better speed. If
sigma1 is not zero, while size1 and size2 are zeros, the kernel size is calculated from the
sigma (to provide accurate enough operation).
@param sigma2 additional parameter for bilateral filtering
<p>
@see cv::GaussianBlur, cv::blur, cv::medianBlur, cv::bilateralFilter.
 */
public static native void cvSmooth( @Const CvArr src, CvArr dst,
                      int smoothtype/*=CV_GAUSSIAN*/,
                      int size1/*=3*/,
                      int size2/*=0*/,
                      double sigma1/*=0*/,
                      double sigma2/*=0*/);
public static native void cvSmooth( @Const CvArr src, CvArr dst);

/** \brief Convolves an image with the kernel.
<p>
@param src input image.
@param dst output image of the same size and the same number of channels as src.
@param kernel convolution kernel (or rather a correlation kernel), a single-channel floating point
matrix; if you want to apply different kernels to different channels, split the image into
separate color planes using split and process them individually.
@param anchor anchor of the kernel that indicates the relative position of a filtered point within
the kernel; the anchor should lie within the kernel; default value (-1,-1) means that the anchor
is at the kernel center.
<p>
@see cv::filter2D
 */
public static native void cvFilter2D( @Const CvArr src, CvArr dst, @Const CvMat kernel,
                        @ByVal(nullValue = "cvPoint(-1,-1)") CvPoint anchor/*=cvPoint(-1,-1)*/);
public static native void cvFilter2D( @Const CvArr src, CvArr dst, @Const CvMat kernel);
public static native void cvFilter2D( @Const CvArr src, CvArr dst, @Const CvMat kernel,
                        @ByVal(nullValue = "cvPoint(-1,-1)") @Cast("CvPoint*") IntBuffer anchor/*=cvPoint(-1,-1)*/);
public static native void cvFilter2D( @Const CvArr src, CvArr dst, @Const CvMat kernel,
                        @ByVal(nullValue = "cvPoint(-1,-1)") @Cast("CvPoint*") int[] anchor/*=cvPoint(-1,-1)*/);

/** \brief Finds integral image: SUM(X,Y) = sum(x<X,y<Y)I(x,y)
@see cv::integral
*/
public static native void cvIntegral( @Const CvArr image, CvArr sum,
                       CvArr sqsum/*=NULL*/,
                       CvArr tilted_sum/*=NULL*/);
public static native void cvIntegral( @Const CvArr image, CvArr sum);

/** \brief Smoothes the input image with gaussian kernel and then down-samples it.
   <p>
   dst_width = floor(src_width/2)[+1],
   dst_height = floor(src_height/2)[+1]
   @see cv::pyrDown
*/
public static native void cvPyrDown( @Const CvArr src, CvArr dst,
                        int filter/*=CV_GAUSSIAN_5x5*/ );
public static native void cvPyrDown( @Const CvArr src, CvArr dst );

/** \brief Up-samples image and smoothes the result with gaussian kernel.
   <p>
   dst_width = src_width*2,
   dst_height = src_height*2
   @see cv::pyrUp
*/
public static native void cvPyrUp( @Const CvArr src, CvArr dst,
                      int filter/*=CV_GAUSSIAN_5x5*/ );
public static native void cvPyrUp( @Const CvArr src, CvArr dst );

/** \brief Builds pyramid for an image
@see buildPyramid
*/
public static native @Cast("CvMat**") PointerPointer cvCreatePyramid( @Const CvArr img, int extra_layers, double rate,
                                @Const CvSize layer_sizes/*=0*/,
                                CvArr bufarr/*=0*/,
                                int calc/*=1*/,
                                int filter/*=CV_GAUSSIAN_5x5*/ );
public static native @ByPtrPtr CvMat cvCreatePyramid( @Const CvArr img, int extra_layers, double rate );

/** \brief Releases pyramid */
public static native void cvReleasePyramid( @Cast("CvMat***") PointerPointer pyramid, int extra_layers );


/** \brief Filters image using meanshift algorithm
@see cv::pyrMeanShiftFiltering
*/
public static native void cvPyrMeanShiftFiltering( @Const CvArr src, CvArr dst,
    double sp, double sr, int max_level/*=1*/,
    @ByVal(nullValue = "cvTermCriteria(CV_TERMCRIT_ITER+CV_TERMCRIT_EPS,5,1)") CvTermCriteria termcrit/*=cvTermCriteria(CV_TERMCRIT_ITER+CV_TERMCRIT_EPS,5,1)*/);
public static native void cvPyrMeanShiftFiltering( @Const CvArr src, CvArr dst,
    double sp, double sr);

/** \brief Segments image using seed "markers"
@see cv::watershed
*/
public static native void cvWatershed( @Const CvArr image, CvArr markers );

/** \brief Calculates an image derivative using generalized Sobel
   <p>
   (aperture_size = 1,3,5,7) or Scharr (aperture_size = -1) operator.
   Scharr can be used only for the first dx or dy derivative
@see cv::Sobel
*/
public static native void cvSobel( @Const CvArr src, CvArr dst,
                    int xorder, int yorder,
                    int aperture_size/*=3*/);
public static native void cvSobel( @Const CvArr src, CvArr dst,
                    int xorder, int yorder);

/** \brief Calculates the image Laplacian: (d2/dx + d2/dy)I
@see cv::Laplacian
*/
public static native void cvLaplace( @Const CvArr src, CvArr dst,
                      int aperture_size/*=3*/ );
public static native void cvLaplace( @Const CvArr src, CvArr dst );

/** \brief Converts input array pixels from one color space to another
@see cv::cvtColor
*/
public static native void cvCvtColor( @Const CvArr src, CvArr dst, int code );


/** \brief Resizes image (input array is resized to fit the destination array)
@see cv::resize
*/
public static native void cvResize( @Const CvArr src, CvArr dst,
                       int interpolation/*=CV_INTER_LINEAR*/);
public static native void cvResize( @Const CvArr src, CvArr dst);

/** \brief Warps image with affine transform
\note ::cvGetQuadrangleSubPix is similar to ::cvWarpAffine, but the outliers are extrapolated using
replication border mode.
@see cv::warpAffine
*/
public static native void cvWarpAffine( @Const CvArr src, CvArr dst, @Const CvMat map_matrix,
                           int flags/*=CV_INTER_LINEAR+CV_WARP_FILL_OUTLIERS*/,
                           @ByVal(nullValue = "cvScalarAll(0)") CvScalar fillval/*=cvScalarAll(0)*/ );
public static native void cvWarpAffine( @Const CvArr src, CvArr dst, @Const CvMat map_matrix );

/** \brief Computes affine transform matrix for mapping src[i] to dst[i] (i=0,1,2)
@see cv::getAffineTransform
*/
public static native CvMat cvGetAffineTransform( @Const CvPoint2D32f src,
                                    @Const CvPoint2D32f dst,
                                    CvMat map_matrix );
public static native CvMat cvGetAffineTransform( @Cast("const CvPoint2D32f*") FloatBuffer src,
                                    @Cast("const CvPoint2D32f*") FloatBuffer dst,
                                    CvMat map_matrix );
public static native CvMat cvGetAffineTransform( @Cast("const CvPoint2D32f*") float[] src,
                                    @Cast("const CvPoint2D32f*") float[] dst,
                                    CvMat map_matrix );

/** \brief Computes rotation_matrix matrix
@see cv::getRotationMatrix2D
*/
public static native CvMat cv2DRotationMatrix( @ByVal CvPoint2D32f center, double angle,
                                   double scale, CvMat map_matrix );
public static native CvMat cv2DRotationMatrix( @ByVal @Cast("CvPoint2D32f*") FloatBuffer center, double angle,
                                   double scale, CvMat map_matrix );
public static native CvMat cv2DRotationMatrix( @ByVal @Cast("CvPoint2D32f*") float[] center, double angle,
                                   double scale, CvMat map_matrix );

/** \brief Warps image with perspective (projective) transform
@see cv::warpPerspective
*/
public static native void cvWarpPerspective( @Const CvArr src, CvArr dst, @Const CvMat map_matrix,
                                int flags/*=CV_INTER_LINEAR+CV_WARP_FILL_OUTLIERS*/,
                                @ByVal(nullValue = "cvScalarAll(0)") CvScalar fillval/*=cvScalarAll(0)*/ );
public static native void cvWarpPerspective( @Const CvArr src, CvArr dst, @Const CvMat map_matrix );

/** \brief Computes perspective transform matrix for mapping src[i] to dst[i] (i=0,1,2,3)
@see cv::getPerspectiveTransform
*/
public static native CvMat cvGetPerspectiveTransform( @Const CvPoint2D32f src,
                                         @Const CvPoint2D32f dst,
                                         CvMat map_matrix );
public static native CvMat cvGetPerspectiveTransform( @Cast("const CvPoint2D32f*") FloatBuffer src,
                                         @Cast("const CvPoint2D32f*") FloatBuffer dst,
                                         CvMat map_matrix );
public static native CvMat cvGetPerspectiveTransform( @Cast("const CvPoint2D32f*") float[] src,
                                         @Cast("const CvPoint2D32f*") float[] dst,
                                         CvMat map_matrix );

/** \brief Performs generic geometric transformation using the specified coordinate maps
@see cv::remap
*/
public static native void cvRemap( @Const CvArr src, CvArr dst,
                      @Const CvArr mapx, @Const CvArr mapy,
                      int flags/*=CV_INTER_LINEAR+CV_WARP_FILL_OUTLIERS*/,
                      @ByVal(nullValue = "cvScalarAll(0)") CvScalar fillval/*=cvScalarAll(0)*/ );
public static native void cvRemap( @Const CvArr src, CvArr dst,
                      @Const CvArr mapx, @Const CvArr mapy );

/** \brief Converts mapx & mapy from floating-point to integer formats for cvRemap
@see cv::convertMaps
*/
public static native void cvConvertMaps( @Const CvArr mapx, @Const CvArr mapy,
                            CvArr mapxy, CvArr mapalpha );

/** \brief Performs forward or inverse log-polar image transform
@see cv::logPolar
*/
public static native void cvLogPolar( @Const CvArr src, CvArr dst,
                         @ByVal CvPoint2D32f center, double M,
                         int flags/*=CV_INTER_LINEAR+CV_WARP_FILL_OUTLIERS*/);
public static native void cvLogPolar( @Const CvArr src, CvArr dst,
                         @ByVal CvPoint2D32f center, double M);
public static native void cvLogPolar( @Const CvArr src, CvArr dst,
                         @ByVal @Cast("CvPoint2D32f*") FloatBuffer center, double M,
                         int flags/*=CV_INTER_LINEAR+CV_WARP_FILL_OUTLIERS*/);
public static native void cvLogPolar( @Const CvArr src, CvArr dst,
                         @ByVal @Cast("CvPoint2D32f*") FloatBuffer center, double M);
public static native void cvLogPolar( @Const CvArr src, CvArr dst,
                         @ByVal @Cast("CvPoint2D32f*") float[] center, double M,
                         int flags/*=CV_INTER_LINEAR+CV_WARP_FILL_OUTLIERS*/);
public static native void cvLogPolar( @Const CvArr src, CvArr dst,
                         @ByVal @Cast("CvPoint2D32f*") float[] center, double M);

/** Performs forward or inverse linear-polar image transform
@see cv::linearPolar
*/
public static native void cvLinearPolar( @Const CvArr src, CvArr dst,
                         @ByVal CvPoint2D32f center, double maxRadius,
                         int flags/*=CV_INTER_LINEAR+CV_WARP_FILL_OUTLIERS*/);
public static native void cvLinearPolar( @Const CvArr src, CvArr dst,
                         @ByVal CvPoint2D32f center, double maxRadius);
public static native void cvLinearPolar( @Const CvArr src, CvArr dst,
                         @ByVal @Cast("CvPoint2D32f*") FloatBuffer center, double maxRadius,
                         int flags/*=CV_INTER_LINEAR+CV_WARP_FILL_OUTLIERS*/);
public static native void cvLinearPolar( @Const CvArr src, CvArr dst,
                         @ByVal @Cast("CvPoint2D32f*") FloatBuffer center, double maxRadius);
public static native void cvLinearPolar( @Const CvArr src, CvArr dst,
                         @ByVal @Cast("CvPoint2D32f*") float[] center, double maxRadius,
                         int flags/*=CV_INTER_LINEAR+CV_WARP_FILL_OUTLIERS*/);
public static native void cvLinearPolar( @Const CvArr src, CvArr dst,
                         @ByVal @Cast("CvPoint2D32f*") float[] center, double maxRadius);

/** \brief Transforms the input image to compensate lens distortion
@see cv::undistort
*/
public static native void cvUndistort2( @Const CvArr src, CvArr dst,
                          @Const CvMat camera_matrix,
                          @Const CvMat distortion_coeffs,
                          @Const CvMat new_camera_matrix/*=0*/ );
public static native void cvUndistort2( @Const CvArr src, CvArr dst,
                          @Const CvMat camera_matrix,
                          @Const CvMat distortion_coeffs );

/** \brief Computes transformation map from intrinsic camera parameters
   that can used by cvRemap
*/
public static native void cvInitUndistortMap( @Const CvMat camera_matrix,
                                @Const CvMat distortion_coeffs,
                                CvArr mapx, CvArr mapy );

/** \brief Computes undistortion+rectification map for a head of stereo camera
@see cv::initUndistortRectifyMap
*/
public static native void cvInitUndistortRectifyMap( @Const CvMat camera_matrix,
                                       @Const CvMat dist_coeffs,
                                       @Const CvMat R, @Const CvMat new_camera_matrix,
                                       CvArr mapx, CvArr mapy );

/** \brief Computes the original (undistorted) feature coordinates
   from the observed (distorted) coordinates
@see cv::undistortPoints
*/
public static native void cvUndistortPoints( @Const CvMat src, CvMat dst,
                               @Const CvMat camera_matrix,
                               @Const CvMat dist_coeffs,
                               @Const CvMat R/*=0*/,
                               @Const CvMat P/*=0*/);
public static native void cvUndistortPoints( @Const CvMat src, CvMat dst,
                               @Const CvMat camera_matrix,
                               @Const CvMat dist_coeffs);

/** \brief Returns a structuring element of the specified size and shape for morphological operations.
<p>
\note the created structuring element IplConvKernel\* element must be released in the end using
{@code cvReleaseStructuringElement(&element)}.
<p>
@param cols Width of the structuring element
@param rows Height of the structuring element
@param anchor_x x-coordinate of the anchor
@param anchor_y y-coordinate of the anchor
@param shape element shape that could be one of the cv::MorphShapes_c
@param values integer array of cols*rows elements that specifies the custom shape of the
structuring element, when shape=CV_SHAPE_CUSTOM.
<p>
@see cv::getStructuringElement
 */
 public static native IplConvKernel cvCreateStructuringElementEx(
             int cols, int rows, int anchor_x, int anchor_y,
             int shape, IntPointer values/*=NULL*/ );
 public static native IplConvKernel cvCreateStructuringElementEx(
             int cols, int rows, int anchor_x, int anchor_y,
             int shape );
 public static native IplConvKernel cvCreateStructuringElementEx(
             int cols, int rows, int anchor_x, int anchor_y,
             int shape, IntBuffer values/*=NULL*/ );
 public static native IplConvKernel cvCreateStructuringElementEx(
             int cols, int rows, int anchor_x, int anchor_y,
             int shape, int[] values/*=NULL*/ );

/** \brief releases structuring element
@see cvCreateStructuringElementEx
*/
public static native void cvReleaseStructuringElement( @Cast("IplConvKernel**") PointerPointer element );
public static native void cvReleaseStructuringElement( @ByPtrPtr IplConvKernel element );

/** \brief erodes input image (applies minimum filter) one or more times.
   If element pointer is NULL, 3x3 rectangular element is used
@see cv::erode
*/
public static native void cvErode( @Const CvArr src, CvArr dst,
                      IplConvKernel element/*=NULL*/,
                      int iterations/*=1*/ );
public static native void cvErode( @Const CvArr src, CvArr dst );

/** \brief dilates input image (applies maximum filter) one or more times.
   <p>
   If element pointer is NULL, 3x3 rectangular element is used
@see cv::dilate
*/
public static native void cvDilate( @Const CvArr src, CvArr dst,
                       IplConvKernel element/*=NULL*/,
                       int iterations/*=1*/ );
public static native void cvDilate( @Const CvArr src, CvArr dst );

/** \brief Performs complex morphological transformation
@see cv::morphologyEx
*/
public static native void cvMorphologyEx( @Const CvArr src, CvArr dst,
                             CvArr temp, IplConvKernel element,
                             int operation, int iterations/*=1*/ );
public static native void cvMorphologyEx( @Const CvArr src, CvArr dst,
                             CvArr temp, IplConvKernel element,
                             int operation );

/** \brief Calculates all spatial and central moments up to the 3rd order
@see cv::moments
*/
public static native void cvMoments( @Const CvArr arr, CvMoments moments, int binary/*=0*/);
public static native void cvMoments( @Const CvArr arr, CvMoments moments);

/** \brief Retrieve spatial moments */
public static native double cvGetSpatialMoment( CvMoments moments, int x_order, int y_order );
/** \brief Retrieve central moments */
public static native double cvGetCentralMoment( CvMoments moments, int x_order, int y_order );
/** \brief Retrieve normalized central moments */
public static native double cvGetNormalizedCentralMoment( CvMoments moments,
                                             int x_order, int y_order );

/** \brief Calculates 7 Hu's invariants from precalculated spatial and central moments
@see cv::HuMoments
*/
public static native void cvGetHuMoments( CvMoments moments, CvHuMoments hu_moments );

/*********************************** data sampling **************************************/

/** \brief Fetches pixels that belong to the specified line segment and stores them to the buffer.
   <p>
   Returns the number of retrieved points.
@see cv::LineSegmentDetector
*/
public static native int cvSampleLine( @Const CvArr image, @ByVal CvPoint pt1, @ByVal CvPoint pt2, Pointer buffer,
                          int connectivity/*=8*/);
public static native int cvSampleLine( @Const CvArr image, @ByVal CvPoint pt1, @ByVal CvPoint pt2, Pointer buffer);
public static native int cvSampleLine( @Const CvArr image, @ByVal @Cast("CvPoint*") IntBuffer pt1, @ByVal @Cast("CvPoint*") IntBuffer pt2, Pointer buffer,
                          int connectivity/*=8*/);
public static native int cvSampleLine( @Const CvArr image, @ByVal @Cast("CvPoint*") IntBuffer pt1, @ByVal @Cast("CvPoint*") IntBuffer pt2, Pointer buffer);
public static native int cvSampleLine( @Const CvArr image, @ByVal @Cast("CvPoint*") int[] pt1, @ByVal @Cast("CvPoint*") int[] pt2, Pointer buffer,
                          int connectivity/*=8*/);
public static native int cvSampleLine( @Const CvArr image, @ByVal @Cast("CvPoint*") int[] pt1, @ByVal @Cast("CvPoint*") int[] pt2, Pointer buffer);

/** \brief Retrieves the rectangular image region with specified center from the input array.
 <p>
 dst(x,y) <- src(x + center.x - dst_width/2, y + center.y - dst_height/2).
 Values of pixels with fractional coordinates are retrieved using bilinear interpolation
@see cv::getRectSubPix
*/
public static native void cvGetRectSubPix( @Const CvArr src, CvArr dst, @ByVal CvPoint2D32f center );
public static native void cvGetRectSubPix( @Const CvArr src, CvArr dst, @ByVal @Cast("CvPoint2D32f*") FloatBuffer center );
public static native void cvGetRectSubPix( @Const CvArr src, CvArr dst, @ByVal @Cast("CvPoint2D32f*") float[] center );


/** \brief Retrieves quadrangle from the input array.
    <p>
    matrixarr = ( a11  a12 | b1 )   dst(x,y) <- src(A[x y]' + b)
                ( a21  a22 | b2 )   (bilinear interpolation is used to retrieve pixels
                                     with fractional coordinates)
@see cvWarpAffine
*/
public static native void cvGetQuadrangleSubPix( @Const CvArr src, CvArr dst,
                                    @Const CvMat map_matrix );

/** \brief Measures similarity between template and overlapped windows in the source image
   and fills the resultant image with the measurements
@see cv::matchTemplate
*/
public static native void cvMatchTemplate( @Const CvArr image, @Const CvArr templ,
                              CvArr result, int method );

/** \brief Computes earth mover distance between
   two weighted point sets (called signatures)
@see cv::EMD
*/
public static native float cvCalcEMD2( @Const CvArr signature1,
                          @Const CvArr signature2,
                          int distance_type,
                          CvDistanceFunction distance_func/*=NULL*/,
                          @Const CvArr cost_matrix/*=NULL*/,
                          CvArr flow/*=NULL*/,
                          FloatPointer lower_bound/*=NULL*/,
                          Pointer userdata/*=NULL*/);
public static native float cvCalcEMD2( @Const CvArr signature1,
                          @Const CvArr signature2,
                          int distance_type);
public static native float cvCalcEMD2( @Const CvArr signature1,
                          @Const CvArr signature2,
                          int distance_type,
                          CvDistanceFunction distance_func/*=NULL*/,
                          @Const CvArr cost_matrix/*=NULL*/,
                          CvArr flow/*=NULL*/,
                          FloatBuffer lower_bound/*=NULL*/,
                          Pointer userdata/*=NULL*/);
public static native float cvCalcEMD2( @Const CvArr signature1,
                          @Const CvArr signature2,
                          int distance_type,
                          CvDistanceFunction distance_func/*=NULL*/,
                          @Const CvArr cost_matrix/*=NULL*/,
                          CvArr flow/*=NULL*/,
                          float[] lower_bound/*=NULL*/,
                          Pointer userdata/*=NULL*/);

/****************************************************************************************\
*                              Contours retrieving                                       *
\****************************************************************************************/

/** \brief Retrieves outer and optionally inner boundaries of white (non-zero) connected
   components in the black (zero) background
@see cv::findContours, cvStartFindContours, cvFindNextContour, cvSubstituteContour, cvEndFindContours
*/
public static native int cvFindContours( CvArr image, CvMemStorage storage, @Cast("CvSeq**") PointerPointer first_contour,
                            int header_size/*=sizeof(CvContour)*/,
                            int mode/*=CV_RETR_LIST*/,
                            int method/*=CV_CHAIN_APPROX_SIMPLE*/,
                            @ByVal(nullValue = "cvPoint(0,0)") CvPoint offset/*=cvPoint(0,0)*/);
public static native int cvFindContours( CvArr image, CvMemStorage storage, @ByPtrPtr CvSeq first_contour);
public static native int cvFindContours( CvArr image, CvMemStorage storage, @ByPtrPtr CvSeq first_contour,
                            int header_size/*=sizeof(CvContour)*/,
                            int mode/*=CV_RETR_LIST*/,
                            int method/*=CV_CHAIN_APPROX_SIMPLE*/,
                            @ByVal(nullValue = "cvPoint(0,0)") CvPoint offset/*=cvPoint(0,0)*/);
public static native int cvFindContours( CvArr image, CvMemStorage storage, @ByPtrPtr CvSeq first_contour,
                            int header_size/*=sizeof(CvContour)*/,
                            int mode/*=CV_RETR_LIST*/,
                            int method/*=CV_CHAIN_APPROX_SIMPLE*/,
                            @ByVal(nullValue = "cvPoint(0,0)") @Cast("CvPoint*") IntBuffer offset/*=cvPoint(0,0)*/);
public static native int cvFindContours( CvArr image, CvMemStorage storage, @ByPtrPtr CvSeq first_contour,
                            int header_size/*=sizeof(CvContour)*/,
                            int mode/*=CV_RETR_LIST*/,
                            int method/*=CV_CHAIN_APPROX_SIMPLE*/,
                            @ByVal(nullValue = "cvPoint(0,0)") @Cast("CvPoint*") int[] offset/*=cvPoint(0,0)*/);

/** \brief Initializes contour retrieving process.
   <p>
   Calls cvStartFindContours.
   Calls cvFindNextContour until null pointer is returned
   or some other condition becomes true.
   Calls cvEndFindContours at the end.
@see cvFindContours
*/
public static native CvContourScanner cvStartFindContours( CvArr image, CvMemStorage storage,
                            int header_size/*=sizeof(CvContour)*/,
                            int mode/*=CV_RETR_LIST*/,
                            int method/*=CV_CHAIN_APPROX_SIMPLE*/,
                            @ByVal(nullValue = "cvPoint(0,0)") CvPoint offset/*=cvPoint(0,0)*/);
public static native CvContourScanner cvStartFindContours( CvArr image, CvMemStorage storage);
public static native CvContourScanner cvStartFindContours( CvArr image, CvMemStorage storage,
                            int header_size/*=sizeof(CvContour)*/,
                            int mode/*=CV_RETR_LIST*/,
                            int method/*=CV_CHAIN_APPROX_SIMPLE*/,
                            @ByVal(nullValue = "cvPoint(0,0)") @Cast("CvPoint*") IntBuffer offset/*=cvPoint(0,0)*/);
public static native CvContourScanner cvStartFindContours( CvArr image, CvMemStorage storage,
                            int header_size/*=sizeof(CvContour)*/,
                            int mode/*=CV_RETR_LIST*/,
                            int method/*=CV_CHAIN_APPROX_SIMPLE*/,
                            @ByVal(nullValue = "cvPoint(0,0)") @Cast("CvPoint*") int[] offset/*=cvPoint(0,0)*/);

/** \brief Retrieves next contour
@see cvFindContours
*/
public static native CvSeq cvFindNextContour( CvContourScanner scanner );


/** \brief Substitutes the last retrieved contour with the new one
   <p>
   (if the substitutor is null, the last retrieved contour is removed from the tree)
@see cvFindContours
*/
public static native void cvSubstituteContour( CvContourScanner scanner, CvSeq new_contour );


/** \brief Releases contour scanner and returns pointer to the first outer contour
@see cvFindContours
*/
public static native CvSeq cvEndFindContours( @ByPtrPtr CvContourScanner scanner );

/** \brief Approximates Freeman chain(s) with a polygonal curve.
<p>
This is a standalone contour approximation routine, not represented in the new interface. When
cvFindContours retrieves contours as Freeman chains, it calls the function to get approximated
contours, represented as polygons.
<p>
@param src_seq Pointer to the approximated Freeman chain that can refer to other chains.
@param storage Storage location for the resulting polylines.
@param method Approximation method (see the description of the function :ocvFindContours ).
@param parameter Method parameter (not used now).
@param minimal_perimeter Approximates only those contours whose perimeters are not less than
minimal_perimeter . Other chains are removed from the resulting structure.
@param recursive Recursion flag. If it is non-zero, the function approximates all chains that can
be obtained from chain by using the h_next or v_next links. Otherwise, the single input chain is
approximated.
@see cvStartReadChainPoints, cvReadChainPoint
 */
public static native CvSeq cvApproxChains( CvSeq src_seq, CvMemStorage storage,
                            int method/*=CV_CHAIN_APPROX_SIMPLE*/,
                            double parameter/*=0*/,
                            int minimal_perimeter/*=0*/,
                            int recursive/*=0*/);
public static native CvSeq cvApproxChains( CvSeq src_seq, CvMemStorage storage);

/** \brief Initializes Freeman chain reader.
   <p>
   The reader is used to iteratively get coordinates of all the chain points.
   If the Freeman codes should be read as is, a simple sequence reader should be used
@see cvApproxChains
*/
public static native void cvStartReadChainPoints( CvChain chain, CvChainPtReader reader );

/** \brief Retrieves the next chain point
@see cvApproxChains
*/
public static native @ByVal CvPoint cvReadChainPoint( CvChainPtReader reader );


/****************************************************************************************\
*                            Contour Processing and Shape Analysis                       *
\****************************************************************************************/

/** \brief Approximates a single polygonal curve (contour) or
   a tree of polygonal curves (contours)
@see cv::approxPolyDP
*/
public static native CvSeq cvApproxPoly( @Const Pointer src_seq,
                             int header_size, CvMemStorage storage,
                             int method, double eps,
                             int recursive/*=0*/);
public static native CvSeq cvApproxPoly( @Const Pointer src_seq,
                             int header_size, CvMemStorage storage,
                             int method, double eps);

/** \brief Calculates perimeter of a contour or length of a part of contour
@see cv::arcLength
*/
public static native double cvArcLength( @Const Pointer curve,
                            @ByVal(nullValue = "CV_WHOLE_SEQ") CvSlice slice/*=CV_WHOLE_SEQ*/,
                            int is_closed/*=-1*/);
public static native double cvArcLength( @Const Pointer curve);

/** same as cvArcLength for closed contour
*/
public static native double cvContourPerimeter( @Const Pointer contour );


/** \brief Calculates contour bounding rectangle (update=1) or
   just retrieves pre-calculated rectangle (update=0)
@see cv::boundingRect
*/
public static native @ByVal CvRect cvBoundingRect( CvArr points, int update/*=0*/ );
public static native @ByVal CvRect cvBoundingRect( CvArr points );

/** \brief Calculates area of a contour or contour segment
@see cv::contourArea
*/
public static native double cvContourArea( @Const CvArr contour,
                              @ByVal(nullValue = "CV_WHOLE_SEQ") CvSlice slice/*=CV_WHOLE_SEQ*/,
                              int oriented/*=0*/);
public static native double cvContourArea( @Const CvArr contour);

/** \brief Finds minimum area rotated rectangle bounding a set of points
@see cv::minAreaRect
*/
public static native @ByVal CvBox2D cvMinAreaRect2( @Const CvArr points,
                                CvMemStorage storage/*=NULL*/);
public static native @ByVal CvBox2D cvMinAreaRect2( @Const CvArr points);

/** \brief Finds minimum enclosing circle for a set of points
@see cv::minEnclosingCircle
*/
public static native int cvMinEnclosingCircle( @Const CvArr points,
                                  CvPoint2D32f center, FloatPointer radius );
public static native int cvMinEnclosingCircle( @Const CvArr points,
                                  @Cast("CvPoint2D32f*") FloatBuffer center, FloatBuffer radius );
public static native int cvMinEnclosingCircle( @Const CvArr points,
                                  @Cast("CvPoint2D32f*") float[] center, float[] radius );

/** \brief Compares two contours by matching their moments
@see cv::matchShapes
*/
public static native double cvMatchShapes( @Const Pointer object1, @Const Pointer object2,
                              int method, double parameter/*=0*/);
public static native double cvMatchShapes( @Const Pointer object1, @Const Pointer object2,
                              int method);

/** \brief Calculates exact convex hull of 2d point set
@see cv::convexHull
*/
public static native CvSeq cvConvexHull2( @Const CvArr input,
                             Pointer hull_storage/*=NULL*/,
                             int orientation/*=CV_CLOCKWISE*/,
                             int return_points/*=0*/);
public static native CvSeq cvConvexHull2( @Const CvArr input);

/** \brief Checks whether the contour is convex or not (returns 1 if convex, 0 if not)
@see cv::isContourConvex
*/
public static native int cvCheckContourConvexity( @Const CvArr contour );


/** \brief Finds convexity defects for the contour
@see cv::convexityDefects
*/
public static native CvSeq cvConvexityDefects( @Const CvArr contour, @Const CvArr convexhull,
                                   CvMemStorage storage/*=NULL*/);
public static native CvSeq cvConvexityDefects( @Const CvArr contour, @Const CvArr convexhull);

/** \brief Fits ellipse into a set of 2d points
@see cv::fitEllipse
*/
public static native @ByVal CvBox2D cvFitEllipse2( @Const CvArr points );

/** \brief Finds minimum rectangle containing two given rectangles */
public static native @ByVal CvRect cvMaxRect( @Const CvRect rect1, @Const CvRect rect2 );

/** \brief Finds coordinates of the box vertices */
public static native void cvBoxPoints( @ByVal CvBox2D box, CvPoint2D32f pt );
public static native void cvBoxPoints( @ByVal CvBox2D box, @Cast("CvPoint2D32f*") FloatBuffer pt );
public static native void cvBoxPoints( @ByVal CvBox2D box, @Cast("CvPoint2D32f*") float[] pt );

/** \brief Initializes sequence header for a matrix (column or row vector) of points
   <p>
   a wrapper for cvMakeSeqHeaderForArray (it does not initialize bounding rectangle!!!) */
public static native CvSeq cvPointSeqFromMat( int seq_kind, @Const CvArr mat,
                                 CvContour contour_header,
                                 CvSeqBlock block );

/** \brief Checks whether the point is inside polygon, outside, on an edge (at a vertex).
   <p>
   Returns positive, negative or zero value, correspondingly.
   Optionally, measures a signed distance between
   the point and the nearest polygon edge (measure_dist=1)
@see cv::pointPolygonTest
*/
public static native double cvPointPolygonTest( @Const CvArr contour,
                                  @ByVal CvPoint2D32f pt, int measure_dist );
public static native double cvPointPolygonTest( @Const CvArr contour,
                                  @ByVal @Cast("CvPoint2D32f*") FloatBuffer pt, int measure_dist );
public static native double cvPointPolygonTest( @Const CvArr contour,
                                  @ByVal @Cast("CvPoint2D32f*") float[] pt, int measure_dist );

/****************************************************************************************\
*                                  Histogram functions                                   *
\****************************************************************************************/

/** \brief Creates a histogram.
<p>
The function creates a histogram of the specified size and returns a pointer to the created
histogram. If the array ranges is 0, the histogram bin ranges must be specified later via the
function cvSetHistBinRanges. Though cvCalcHist and cvCalcBackProject may process 8-bit images
without setting bin ranges, they assume they are equally spaced in 0 to 255 bins.
<p>
@param dims Number of histogram dimensions.
@param sizes Array of the histogram dimension sizes.
@param type Histogram representation format. CV_HIST_ARRAY means that the histogram data is
represented as a multi-dimensional dense array CvMatND. CV_HIST_SPARSE means that histogram data
is represented as a multi-dimensional sparse array CvSparseMat.
@param ranges Array of ranges for the histogram bins. Its meaning depends on the uniform parameter
value. The ranges are used when the histogram is calculated or backprojected to determine which
histogram bin corresponds to which value/tuple of values from the input image(s).
@param uniform Uniformity flag. If not zero, the histogram has evenly spaced bins and for every
\f$0<=i<cDims\f$ ranges[i] is an array of two numbers: lower and upper boundaries for the i-th
histogram dimension. The whole range [lower,upper] is then split into dims[i] equal parts to
determine the i-th input tuple value ranges for every histogram bin. And if uniform=0 , then the
i-th element of the ranges array contains dims[i]+1 elements: \f$\texttt{lower}_0,
\texttt{upper}_0, \texttt{lower}_1, \texttt{upper}_1 = \texttt{lower}_2,
...
\texttt{upper}_{dims[i]-1}\f$ where \f$\texttt{lower}_j\f$ and \f$\texttt{upper}_j\f$ are lower
and upper boundaries of the i-th input tuple value for the j-th bin, respectively. In either
case, the input values that are beyond the specified range for a histogram bin are not counted
by cvCalcHist and filled with 0 by cvCalcBackProject.
 */
public static native CvHistogram cvCreateHist( int dims, IntPointer sizes, int type,
                                   @Cast("float**") PointerPointer ranges/*=NULL*/,
                                   int uniform/*=1*/);
public static native CvHistogram cvCreateHist( int dims, IntPointer sizes, int type);
public static native CvHistogram cvCreateHist( int dims, IntPointer sizes, int type,
                                   @ByPtrPtr FloatPointer ranges/*=NULL*/,
                                   int uniform/*=1*/);
public static native CvHistogram cvCreateHist( int dims, IntBuffer sizes, int type,
                                   @ByPtrPtr FloatBuffer ranges/*=NULL*/,
                                   int uniform/*=1*/);
public static native CvHistogram cvCreateHist( int dims, IntBuffer sizes, int type);
public static native CvHistogram cvCreateHist( int dims, int[] sizes, int type,
                                   @ByPtrPtr float[] ranges/*=NULL*/,
                                   int uniform/*=1*/);
public static native CvHistogram cvCreateHist( int dims, int[] sizes, int type);

/** \brief Sets the bounds of the histogram bins.
<p>
This is a standalone function for setting bin ranges in the histogram. For a more detailed
description of the parameters ranges and uniform, see the :ocvCalcHist function that can initialize
the ranges as well. Ranges for the histogram bins must be set before the histogram is calculated or
the backproject of the histogram is calculated.
<p>
@param hist Histogram.
@param ranges Array of bin ranges arrays. See :ocvCreateHist for details.
@param uniform Uniformity flag. See :ocvCreateHist for details.
 */
public static native void cvSetHistBinRanges( CvHistogram hist, @Cast("float**") PointerPointer ranges,
                                int uniform/*=1*/);
public static native void cvSetHistBinRanges( CvHistogram hist, @ByPtrPtr FloatPointer ranges);
public static native void cvSetHistBinRanges( CvHistogram hist, @ByPtrPtr FloatPointer ranges,
                                int uniform/*=1*/);
public static native void cvSetHistBinRanges( CvHistogram hist, @ByPtrPtr FloatBuffer ranges,
                                int uniform/*=1*/);
public static native void cvSetHistBinRanges( CvHistogram hist, @ByPtrPtr FloatBuffer ranges);
public static native void cvSetHistBinRanges( CvHistogram hist, @ByPtrPtr float[] ranges,
                                int uniform/*=1*/);
public static native void cvSetHistBinRanges( CvHistogram hist, @ByPtrPtr float[] ranges);

/** \brief Makes a histogram out of an array.
<p>
The function initializes the histogram, whose header and bins are allocated by the user.
cvReleaseHist does not need to be called afterwards. Only dense histograms can be initialized this
way. The function returns hist.
<p>
@param dims Number of the histogram dimensions.
@param sizes Array of the histogram dimension sizes.
@param hist Histogram header initialized by the function.
@param data Array used to store histogram bins.
@param ranges Histogram bin ranges. See cvCreateHist for details.
@param uniform Uniformity flag. See cvCreateHist for details.
 */
public static native CvHistogram cvMakeHistHeaderForArray(
                            int dims, IntPointer sizes, CvHistogram hist,
                            FloatPointer data, @Cast("float**") PointerPointer ranges/*=NULL*/,
                            int uniform/*=1*/);
public static native CvHistogram cvMakeHistHeaderForArray(
                            int dims, IntPointer sizes, CvHistogram hist,
                            FloatPointer data);
public static native CvHistogram cvMakeHistHeaderForArray(
                            int dims, IntPointer sizes, CvHistogram hist,
                            FloatPointer data, @ByPtrPtr FloatPointer ranges/*=NULL*/,
                            int uniform/*=1*/);
public static native CvHistogram cvMakeHistHeaderForArray(
                            int dims, IntBuffer sizes, CvHistogram hist,
                            FloatBuffer data, @ByPtrPtr FloatBuffer ranges/*=NULL*/,
                            int uniform/*=1*/);
public static native CvHistogram cvMakeHistHeaderForArray(
                            int dims, IntBuffer sizes, CvHistogram hist,
                            FloatBuffer data);
public static native CvHistogram cvMakeHistHeaderForArray(
                            int dims, int[] sizes, CvHistogram hist,
                            float[] data, @ByPtrPtr float[] ranges/*=NULL*/,
                            int uniform/*=1*/);
public static native CvHistogram cvMakeHistHeaderForArray(
                            int dims, int[] sizes, CvHistogram hist,
                            float[] data);

/** \brief Releases the histogram.
<p>
The function releases the histogram (header and the data). The pointer to the histogram is cleared
by the function. If \*hist pointer is already NULL, the function does nothing.
<p>
@param hist Double pointer to the released histogram.
 */
public static native void cvReleaseHist( @Cast("CvHistogram**") PointerPointer hist );
public static native void cvReleaseHist( @ByPtrPtr CvHistogram hist );

/** \brief Clears the histogram.
<p>
The function sets all of the histogram bins to 0 in case of a dense histogram and removes all
histogram bins in case of a sparse array.
<p>
@param hist Histogram.
 */
public static native void cvClearHist( CvHistogram hist );

/** \brief Finds the minimum and maximum histogram bins.
<p>
The function finds the minimum and maximum histogram bins and their positions. All of output
arguments are optional. Among several extremas with the same value the ones with the minimum index
(in the lexicographical order) are returned. In case of several maximums or minimums, the earliest
in the lexicographical order (extrema locations) is returned.
<p>
@param hist Histogram.
@param min_value Pointer to the minimum value of the histogram.
@param max_value Pointer to the maximum value of the histogram.
@param min_idx Pointer to the array of coordinates for the minimum.
@param max_idx Pointer to the array of coordinates for the maximum.
 */
public static native void cvGetMinMaxHistValue( @Const CvHistogram hist,
                                   FloatPointer min_value, FloatPointer max_value,
                                   IntPointer min_idx/*=NULL*/,
                                   IntPointer max_idx/*=NULL*/);
public static native void cvGetMinMaxHistValue( @Const CvHistogram hist,
                                   FloatPointer min_value, FloatPointer max_value);
public static native void cvGetMinMaxHistValue( @Const CvHistogram hist,
                                   FloatBuffer min_value, FloatBuffer max_value,
                                   IntBuffer min_idx/*=NULL*/,
                                   IntBuffer max_idx/*=NULL*/);
public static native void cvGetMinMaxHistValue( @Const CvHistogram hist,
                                   FloatBuffer min_value, FloatBuffer max_value);
public static native void cvGetMinMaxHistValue( @Const CvHistogram hist,
                                   float[] min_value, float[] max_value,
                                   int[] min_idx/*=NULL*/,
                                   int[] max_idx/*=NULL*/);
public static native void cvGetMinMaxHistValue( @Const CvHistogram hist,
                                   float[] min_value, float[] max_value);


/** \brief Normalizes the histogram.
<p>
The function normalizes the histogram bins by scaling them so that the sum of the bins becomes equal
to factor.
<p>
@param hist Pointer to the histogram.
@param factor Normalization factor.
 */
public static native void cvNormalizeHist( CvHistogram hist, double factor );


/** \brief Thresholds the histogram.
<p>
The function clears histogram bins that are below the specified threshold.
<p>
@param hist Pointer to the histogram.
@param threshold Threshold level.
 */
public static native void cvThreshHist( CvHistogram hist, double threshold );


/** Compares two histogram */
public static native double cvCompareHist( @Const CvHistogram hist1,
                              @Const CvHistogram hist2,
                              int method);

/** \brief Copies a histogram.
<p>
The function makes a copy of the histogram. If the second histogram pointer \*dst is NULL, a new
histogram of the same size as src is created. Otherwise, both histograms must have equal types and
sizes. Then the function copies the bin values of the source histogram to the destination histogram
and sets the same bin value ranges as in src.
<p>
@param src Source histogram.
@param dst Pointer to the destination histogram.
 */
public static native void cvCopyHist( @Const CvHistogram src, @Cast("CvHistogram**") PointerPointer dst );
public static native void cvCopyHist( @Const CvHistogram src, @ByPtrPtr CvHistogram dst );


/** \brief Calculates bayesian probabilistic histograms
   (each or src and dst is an array of _number_ histograms */
public static native void cvCalcBayesianProb( @Cast("CvHistogram**") PointerPointer src, int number,
                                @Cast("CvHistogram**") PointerPointer dst);
public static native void cvCalcBayesianProb( @ByPtrPtr CvHistogram src, int number,
                                @ByPtrPtr CvHistogram dst);

/** \brief Calculates array histogram
@see cv::calcHist
*/
public static native void cvCalcArrHist( @Cast("CvArr**") PointerPointer arr, CvHistogram hist,
                            int accumulate/*=0*/,
                            @Const CvArr mask/*=NULL*/ );
public static native void cvCalcArrHist( @ByPtrPtr CvArr arr, CvHistogram hist );
public static native void cvCalcArrHist( @ByPtrPtr CvArr arr, CvHistogram hist,
                            int accumulate/*=0*/,
                            @Const CvArr mask/*=NULL*/ );

/** \overload */
public static native void cvCalcHist( @Cast("IplImage**") PointerPointer image, CvHistogram hist,
                             int accumulate/*=0*/,
                             @Const CvArr mask/*=NULL*/ );
public static native void cvCalcHist( @ByPtrPtr IplImage image, CvHistogram hist );
public static native void cvCalcHist( @ByPtrPtr IplImage image, CvHistogram hist,
                             int accumulate/*=0*/,
                             @Const CvArr mask/*=NULL*/ );

/** \brief Calculates back project
@see cvCalcBackProject, cv::calcBackProject
*/
public static native void cvCalcArrBackProject( @Cast("CvArr**") PointerPointer image, CvArr dst,
                                   @Const CvHistogram hist );
public static native void cvCalcArrBackProject( @ByPtrPtr CvArr image, CvArr dst,
                                   @Const CvHistogram hist );

public static native void cvCalcBackProject(@Cast("IplImage**") PointerPointer image, CvArr dst, CvHistogram hist);
public static native void cvCalcBackProject(@ByPtrPtr IplImage image, CvArr dst, CvHistogram hist);


/** \brief Locates a template within an image by using a histogram comparison.
<p>
The function calculates the back projection by comparing histograms of the source image patches with
the given histogram. The function is similar to matchTemplate, but instead of comparing the raster
patch with all its possible positions within the search window, the function CalcBackProjectPatch
compares histograms. See the algorithm diagram below:
<p>
![image](pics/backprojectpatch.png)
<p>
@param image Source images (though, you may pass CvMat\*\* as well).
@param dst Destination image.
@param range
@param hist Histogram.
@param method Comparison method passed to cvCompareHist (see the function description).
@param factor Normalization factor for histograms that affects the normalization scale of the
destination image. Pass 1 if not sure.
<p>
@see cvCalcBackProjectPatch
 */
public static native void cvCalcArrBackProjectPatch( @Cast("CvArr**") PointerPointer image, CvArr dst, @ByVal CvSize range,
                                        CvHistogram hist, int method,
                                        double factor );
public static native void cvCalcArrBackProjectPatch( @ByPtrPtr CvArr image, CvArr dst, @ByVal CvSize range,
                                        CvHistogram hist, int method,
                                        double factor );

public static native void cvCalcBackProjectPatch(@Cast("IplImage**") PointerPointer image, CvArr dst, @ByVal CvSize range, CvHistogram hist, int method, double factor);
public static native void cvCalcBackProjectPatch(@ByPtrPtr IplImage image, CvArr dst, @ByVal CvSize range, CvHistogram hist, int method, double factor);


/** \brief Divides one histogram by another.
<p>
The function calculates the object probability density from two histograms as:
<p>
\f[\texttt{disthist} (I)= \forkthree{0}{if \(\texttt{hist1}(I)=0\)}{\texttt{scale}}{if \(\texttt{hist1}(I) \ne 0\) and \(\texttt{hist2}(I) > \texttt{hist1}(I)\)}{\frac{\texttt{hist2}(I) \cdot \texttt{scale}}{\texttt{hist1}(I)}}{if \(\texttt{hist1}(I) \ne 0\) and \(\texttt{hist2}(I) \le \texttt{hist1}(I)\)}\f]
<p>
@param hist1 First histogram (the divisor).
@param hist2 Second histogram.
@param dst_hist Destination histogram.
@param scale Scale factor for the destination histogram.
 */
public static native void cvCalcProbDensity( @Const CvHistogram hist1, @Const CvHistogram hist2,
                                CvHistogram dst_hist, double scale/*=255*/ );
public static native void cvCalcProbDensity( @Const CvHistogram hist1, @Const CvHistogram hist2,
                                CvHistogram dst_hist );

/** \brief equalizes histogram of 8-bit single-channel image
@see cv::equalizeHist
*/
public static native void cvEqualizeHist( @Const CvArr src, CvArr dst );


/** \brief Applies distance transform to binary image
@see cv::distanceTransform
*/
public static native void cvDistTransform( @Const CvArr src, CvArr dst,
                              int distance_type/*=CV_DIST_L2*/,
                              int mask_size/*=3*/,
                              @Const FloatPointer mask/*=NULL*/,
                              CvArr labels/*=NULL*/,
                              int labelType/*=CV_DIST_LABEL_CCOMP*/);
public static native void cvDistTransform( @Const CvArr src, CvArr dst);
public static native void cvDistTransform( @Const CvArr src, CvArr dst,
                              int distance_type/*=CV_DIST_L2*/,
                              int mask_size/*=3*/,
                              @Const FloatBuffer mask/*=NULL*/,
                              CvArr labels/*=NULL*/,
                              int labelType/*=CV_DIST_LABEL_CCOMP*/);
public static native void cvDistTransform( @Const CvArr src, CvArr dst,
                              int distance_type/*=CV_DIST_L2*/,
                              int mask_size/*=3*/,
                              @Const float[] mask/*=NULL*/,
                              CvArr labels/*=NULL*/,
                              int labelType/*=CV_DIST_LABEL_CCOMP*/);


/** \brief Applies fixed-level threshold to grayscale image.
   <p>
   This is a basic operation applied before retrieving contours
@see cv::threshold
*/
public static native double cvThreshold( @Const CvArr src, CvArr dst,
                            double threshold, double max_value,
                            int threshold_type );

/** \brief Applies adaptive threshold to grayscale image.
   <p>
   The two parameters for methods CV_ADAPTIVE_THRESH_MEAN_C and
   CV_ADAPTIVE_THRESH_GAUSSIAN_C are:
   neighborhood size (3, 5, 7 etc.),
   and a constant subtracted from mean (...,-3,-2,-1,0,1,2,3,...)
@see cv::adaptiveThreshold
*/
public static native void cvAdaptiveThreshold( @Const CvArr src, CvArr dst, double max_value,
                                  int adaptive_method/*=CV_ADAPTIVE_THRESH_MEAN_C*/,
                                  int threshold_type/*=CV_THRESH_BINARY*/,
                                  int block_size/*=3*/,
                                  double param1/*=5*/);
public static native void cvAdaptiveThreshold( @Const CvArr src, CvArr dst, double max_value);

/** \brief Fills the connected component until the color difference gets large enough
@see cv::floodFill
*/
public static native void cvFloodFill( CvArr image, @ByVal CvPoint seed_point,
                          @ByVal CvScalar new_val, @ByVal(nullValue = "cvScalarAll(0)") CvScalar lo_diff/*=cvScalarAll(0)*/,
                          @ByVal(nullValue = "cvScalarAll(0)") CvScalar up_diff/*=cvScalarAll(0)*/,
                          CvConnectedComp comp/*=NULL*/,
                          int flags/*=4*/,
                          CvArr mask/*=NULL*/);
public static native void cvFloodFill( CvArr image, @ByVal CvPoint seed_point,
                          @ByVal CvScalar new_val);
public static native void cvFloodFill( CvArr image, @ByVal @Cast("CvPoint*") IntBuffer seed_point,
                          @ByVal CvScalar new_val, @ByVal(nullValue = "cvScalarAll(0)") CvScalar lo_diff/*=cvScalarAll(0)*/,
                          @ByVal(nullValue = "cvScalarAll(0)") CvScalar up_diff/*=cvScalarAll(0)*/,
                          CvConnectedComp comp/*=NULL*/,
                          int flags/*=4*/,
                          CvArr mask/*=NULL*/);
public static native void cvFloodFill( CvArr image, @ByVal @Cast("CvPoint*") IntBuffer seed_point,
                          @ByVal CvScalar new_val);
public static native void cvFloodFill( CvArr image, @ByVal @Cast("CvPoint*") int[] seed_point,
                          @ByVal CvScalar new_val, @ByVal(nullValue = "cvScalarAll(0)") CvScalar lo_diff/*=cvScalarAll(0)*/,
                          @ByVal(nullValue = "cvScalarAll(0)") CvScalar up_diff/*=cvScalarAll(0)*/,
                          CvConnectedComp comp/*=NULL*/,
                          int flags/*=4*/,
                          CvArr mask/*=NULL*/);
public static native void cvFloodFill( CvArr image, @ByVal @Cast("CvPoint*") int[] seed_point,
                          @ByVal CvScalar new_val);

/****************************************************************************************\
*                                  Feature detection                                     *
\****************************************************************************************/

/** \brief Runs canny edge detector
@see cv::Canny
*/
public static native void cvCanny( @Const CvArr image, CvArr edges, double threshold1,
                      double threshold2, int aperture_size/*=3*/ );
public static native void cvCanny( @Const CvArr image, CvArr edges, double threshold1,
                      double threshold2 );

/** \brief Calculates constraint image for corner detection
   <p>
   Dx^2 * Dyy + Dxx * Dy^2 - 2 * Dx * Dy * Dxy.
   Applying threshold to the result gives coordinates of corners
@see cv::preCornerDetect
*/
public static native void cvPreCornerDetect( @Const CvArr image, CvArr corners,
                               int aperture_size/*=3*/ );
public static native void cvPreCornerDetect( @Const CvArr image, CvArr corners );

/** \brief Calculates eigen values and vectors of 2x2
   gradient covariation matrix at every image pixel
@see cv::cornerEigenValsAndVecs
*/
public static native void cvCornerEigenValsAndVecs( @Const CvArr image, CvArr eigenvv,
                                       int block_size, int aperture_size/*=3*/ );
public static native void cvCornerEigenValsAndVecs( @Const CvArr image, CvArr eigenvv,
                                       int block_size );

/** \brief Calculates minimal eigenvalue for 2x2 gradient covariation matrix at
   every image pixel
@see cv::cornerMinEigenVal
*/
public static native void cvCornerMinEigenVal( @Const CvArr image, CvArr eigenval,
                                  int block_size, int aperture_size/*=3*/ );
public static native void cvCornerMinEigenVal( @Const CvArr image, CvArr eigenval,
                                  int block_size );

/** \brief Harris corner detector:
   <p>
   Calculates det(M) - k*(trace(M)^2), where M is 2x2 gradient covariation matrix for each pixel
@see cv::cornerHarris
*/
public static native void cvCornerHarris( @Const CvArr image, CvArr harris_response,
                             int block_size, int aperture_size/*=3*/,
                             double k/*=0.04*/ );
public static native void cvCornerHarris( @Const CvArr image, CvArr harris_response,
                             int block_size );

/** \brief Adjust corner position using some sort of gradient search
@see cv::cornerSubPix
*/
public static native void cvFindCornerSubPix( @Const CvArr image, CvPoint2D32f corners,
                                 int count, @ByVal CvSize win, @ByVal CvSize zero_zone,
                                 @ByVal CvTermCriteria criteria );
public static native void cvFindCornerSubPix( @Const CvArr image, @Cast("CvPoint2D32f*") FloatBuffer corners,
                                 int count, @ByVal CvSize win, @ByVal CvSize zero_zone,
                                 @ByVal CvTermCriteria criteria );
public static native void cvFindCornerSubPix( @Const CvArr image, @Cast("CvPoint2D32f*") float[] corners,
                                 int count, @ByVal CvSize win, @ByVal CvSize zero_zone,
                                 @ByVal CvTermCriteria criteria );

/** \brief Finds a sparse set of points within the selected region
   that seem to be easy to track
@see cv::goodFeaturesToTrack
*/
public static native void cvGoodFeaturesToTrack( @Const CvArr image, CvArr eig_image,
                                    CvArr temp_image, CvPoint2D32f corners,
                                    IntPointer corner_count, double quality_level,
                                    double min_distance,
                                    @Const CvArr mask/*=NULL*/,
                                    int block_size/*=3*/,
                                    int use_harris/*=0*/,
                                    double k/*=0.04*/ );
public static native void cvGoodFeaturesToTrack( @Const CvArr image, CvArr eig_image,
                                    CvArr temp_image, CvPoint2D32f corners,
                                    IntPointer corner_count, double quality_level,
                                    double min_distance );
public static native void cvGoodFeaturesToTrack( @Const CvArr image, CvArr eig_image,
                                    CvArr temp_image, @Cast("CvPoint2D32f*") FloatBuffer corners,
                                    IntBuffer corner_count, double quality_level,
                                    double min_distance,
                                    @Const CvArr mask/*=NULL*/,
                                    int block_size/*=3*/,
                                    int use_harris/*=0*/,
                                    double k/*=0.04*/ );
public static native void cvGoodFeaturesToTrack( @Const CvArr image, CvArr eig_image,
                                    CvArr temp_image, @Cast("CvPoint2D32f*") FloatBuffer corners,
                                    IntBuffer corner_count, double quality_level,
                                    double min_distance );
public static native void cvGoodFeaturesToTrack( @Const CvArr image, CvArr eig_image,
                                    CvArr temp_image, @Cast("CvPoint2D32f*") float[] corners,
                                    int[] corner_count, double quality_level,
                                    double min_distance,
                                    @Const CvArr mask/*=NULL*/,
                                    int block_size/*=3*/,
                                    int use_harris/*=0*/,
                                    double k/*=0.04*/ );
public static native void cvGoodFeaturesToTrack( @Const CvArr image, CvArr eig_image,
                                    CvArr temp_image, @Cast("CvPoint2D32f*") float[] corners,
                                    int[] corner_count, double quality_level,
                                    double min_distance );

/** \brief Finds lines on binary image using one of several methods.
   <p>
   line_storage is either memory storage or 1 x _max number of lines_ CvMat, its
   number of columns is changed by the function.
   method is one of CV_HOUGH_*;
   rho, theta and threshold are used for each of those methods;
   param1 ~ line length, param2 ~ line gap - for probabilistic,
   param1 ~ srn, param2 ~ stn - for multi-scale
@see cv::HoughLines
*/
public static native CvSeq cvHoughLines2( CvArr image, Pointer line_storage, int method,
                              double rho, double theta, int threshold,
                              double param1/*=0*/, double param2/*=0*/,
                              double min_theta/*=0*/, double max_theta/*=CV_PI*/);
public static native CvSeq cvHoughLines2( CvArr image, Pointer line_storage, int method,
                              double rho, double theta, int threshold);

/** \brief Finds circles in the image
@see cv::HoughCircles
*/
public static native CvSeq cvHoughCircles( CvArr image, Pointer circle_storage,
                              int method, double dp, double min_dist,
                              double param1/*=100*/,
                              double param2/*=100*/,
                              int min_radius/*=0*/,
                              int max_radius/*=0*/);
public static native CvSeq cvHoughCircles( CvArr image, Pointer circle_storage,
                              int method, double dp, double min_dist);

/** \brief Fits a line into set of 2d or 3d points in a robust way (M-estimator technique)
@see cv::fitLine
*/
public static native void cvFitLine( @Const CvArr points, int dist_type, double param,
                        double reps, double aeps, FloatPointer line );
public static native void cvFitLine( @Const CvArr points, int dist_type, double param,
                        double reps, double aeps, FloatBuffer line );
public static native void cvFitLine( @Const CvArr points, int dist_type, double param,
                        double reps, double aeps, float[] line );

/****************************************************************************************\
*                                     Drawing                                            *
\****************************************************************************************/

/****************************************************************************************\
*       Drawing functions work with images/matrices of arbitrary type.                   *
*       For color images the channel order is BGR[A]                                     *
*       Antialiasing is supported only for 8-bit image now.                              *
*       All the functions include parameter color that means rgb value (that may be      *
*       constructed with CV_RGB macro) for color images and brightness                   *
*       for grayscale images.                                                            *
*       If a drawn figure is partially or completely outside of the image, it is clipped.*
\****************************************************************************************/

// #define CV_RGB( r, g, b )  cvScalar( (b), (g), (r), 0 )
public static final int CV_FILLED = -1;

public static final int CV_AA = 16;

/** \brief Draws 4-connected, 8-connected or antialiased line segment connecting two points
@see cv::line
*/
public static native void cvLine( CvArr img, @ByVal CvPoint pt1, @ByVal CvPoint pt2,
                     @ByVal CvScalar color, int thickness/*=1*/,
                     int line_type/*=8*/, int shift/*=0*/ );
public static native void cvLine( CvArr img, @ByVal CvPoint pt1, @ByVal CvPoint pt2,
                     @ByVal CvScalar color );
public static native void cvLine( CvArr img, @ByVal @Cast("CvPoint*") IntBuffer pt1, @ByVal @Cast("CvPoint*") IntBuffer pt2,
                     @ByVal CvScalar color, int thickness/*=1*/,
                     int line_type/*=8*/, int shift/*=0*/ );
public static native void cvLine( CvArr img, @ByVal @Cast("CvPoint*") IntBuffer pt1, @ByVal @Cast("CvPoint*") IntBuffer pt2,
                     @ByVal CvScalar color );
public static native void cvLine( CvArr img, @ByVal @Cast("CvPoint*") int[] pt1, @ByVal @Cast("CvPoint*") int[] pt2,
                     @ByVal CvScalar color, int thickness/*=1*/,
                     int line_type/*=8*/, int shift/*=0*/ );
public static native void cvLine( CvArr img, @ByVal @Cast("CvPoint*") int[] pt1, @ByVal @Cast("CvPoint*") int[] pt2,
                     @ByVal CvScalar color );

/** \brief Draws a rectangle given two opposite corners of the rectangle (pt1 & pt2)
   <p>
   if thickness<0 (e.g. thickness == CV_FILLED), the filled box is drawn
@see cv::rectangle
*/
public static native void cvRectangle( CvArr img, @ByVal CvPoint pt1, @ByVal CvPoint pt2,
                          @ByVal CvScalar color, int thickness/*=1*/,
                          int line_type/*=8*/,
                          int shift/*=0*/);
public static native void cvRectangle( CvArr img, @ByVal CvPoint pt1, @ByVal CvPoint pt2,
                          @ByVal CvScalar color);
public static native void cvRectangle( CvArr img, @ByVal @Cast("CvPoint*") IntBuffer pt1, @ByVal @Cast("CvPoint*") IntBuffer pt2,
                          @ByVal CvScalar color, int thickness/*=1*/,
                          int line_type/*=8*/,
                          int shift/*=0*/);
public static native void cvRectangle( CvArr img, @ByVal @Cast("CvPoint*") IntBuffer pt1, @ByVal @Cast("CvPoint*") IntBuffer pt2,
                          @ByVal CvScalar color);
public static native void cvRectangle( CvArr img, @ByVal @Cast("CvPoint*") int[] pt1, @ByVal @Cast("CvPoint*") int[] pt2,
                          @ByVal CvScalar color, int thickness/*=1*/,
                          int line_type/*=8*/,
                          int shift/*=0*/);
public static native void cvRectangle( CvArr img, @ByVal @Cast("CvPoint*") int[] pt1, @ByVal @Cast("CvPoint*") int[] pt2,
                          @ByVal CvScalar color);

/** \brief Draws a rectangle specified by a CvRect structure
@see cv::rectangle
*/
public static native void cvRectangleR( CvArr img, @ByVal CvRect r,
                           @ByVal CvScalar color, int thickness/*=1*/,
                           int line_type/*=8*/,
                           int shift/*=0*/);
public static native void cvRectangleR( CvArr img, @ByVal CvRect r,
                           @ByVal CvScalar color);


/** \brief Draws a circle with specified center and radius.
   <p>
   Thickness works in the same way as with cvRectangle
@see cv::circle
*/
public static native void cvCircle( CvArr img, @ByVal CvPoint center, int radius,
                       @ByVal CvScalar color, int thickness/*=1*/,
                       int line_type/*=8*/, int shift/*=0*/);
public static native void cvCircle( CvArr img, @ByVal CvPoint center, int radius,
                       @ByVal CvScalar color);
public static native void cvCircle( CvArr img, @ByVal @Cast("CvPoint*") IntBuffer center, int radius,
                       @ByVal CvScalar color, int thickness/*=1*/,
                       int line_type/*=8*/, int shift/*=0*/);
public static native void cvCircle( CvArr img, @ByVal @Cast("CvPoint*") IntBuffer center, int radius,
                       @ByVal CvScalar color);
public static native void cvCircle( CvArr img, @ByVal @Cast("CvPoint*") int[] center, int radius,
                       @ByVal CvScalar color, int thickness/*=1*/,
                       int line_type/*=8*/, int shift/*=0*/);
public static native void cvCircle( CvArr img, @ByVal @Cast("CvPoint*") int[] center, int radius,
                       @ByVal CvScalar color);

/** \brief Draws ellipse outline, filled ellipse, elliptic arc or filled elliptic sector
   <p>
   depending on _thickness_, _start_angle_ and _end_angle_ parameters. The resultant figure
   is rotated by _angle_. All the angles are in degrees
@see cv::ellipse
*/
public static native void cvEllipse( CvArr img, @ByVal CvPoint center, @ByVal CvSize axes,
                        double angle, double start_angle, double end_angle,
                        @ByVal CvScalar color, int thickness/*=1*/,
                        int line_type/*=8*/, int shift/*=0*/);
public static native void cvEllipse( CvArr img, @ByVal CvPoint center, @ByVal CvSize axes,
                        double angle, double start_angle, double end_angle,
                        @ByVal CvScalar color);
public static native void cvEllipse( CvArr img, @ByVal @Cast("CvPoint*") IntBuffer center, @ByVal CvSize axes,
                        double angle, double start_angle, double end_angle,
                        @ByVal CvScalar color, int thickness/*=1*/,
                        int line_type/*=8*/, int shift/*=0*/);
public static native void cvEllipse( CvArr img, @ByVal @Cast("CvPoint*") IntBuffer center, @ByVal CvSize axes,
                        double angle, double start_angle, double end_angle,
                        @ByVal CvScalar color);
public static native void cvEllipse( CvArr img, @ByVal @Cast("CvPoint*") int[] center, @ByVal CvSize axes,
                        double angle, double start_angle, double end_angle,
                        @ByVal CvScalar color, int thickness/*=1*/,
                        int line_type/*=8*/, int shift/*=0*/);
public static native void cvEllipse( CvArr img, @ByVal @Cast("CvPoint*") int[] center, @ByVal CvSize axes,
                        double angle, double start_angle, double end_angle,
                        @ByVal CvScalar color);

public static native void cvEllipseBox( CvArr img, @ByVal CvBox2D box, @ByVal CvScalar color,
                               int thickness/*=1*/,
                               int line_type/*=8*/, int shift/*=0*/ );
public static native void cvEllipseBox( CvArr img, @ByVal CvBox2D box, @ByVal CvScalar color );

/** \brief Fills convex or monotonous polygon.
@see cv::fillConvexPoly
*/
public static native void cvFillConvexPoly( CvArr img, @Const CvPoint pts, int npts, @ByVal CvScalar color,
                               int line_type/*=8*/, int shift/*=0*/);
public static native void cvFillConvexPoly( CvArr img, @Const CvPoint pts, int npts, @ByVal CvScalar color);
public static native void cvFillConvexPoly( CvArr img, @Cast("const CvPoint*") IntBuffer pts, int npts, @ByVal CvScalar color,
                               int line_type/*=8*/, int shift/*=0*/);
public static native void cvFillConvexPoly( CvArr img, @Cast("const CvPoint*") IntBuffer pts, int npts, @ByVal CvScalar color);
public static native void cvFillConvexPoly( CvArr img, @Cast("const CvPoint*") int[] pts, int npts, @ByVal CvScalar color,
                               int line_type/*=8*/, int shift/*=0*/);
public static native void cvFillConvexPoly( CvArr img, @Cast("const CvPoint*") int[] pts, int npts, @ByVal CvScalar color);

/** \brief Fills an area bounded by one or more arbitrary polygons
@see cv::fillPoly
*/
public static native void cvFillPoly( CvArr img, @Cast("CvPoint**") PointerPointer pts, @Const IntPointer npts,
                         int contours, @ByVal CvScalar color,
                         int line_type/*=8*/, int shift/*=0*/ );
public static native void cvFillPoly( CvArr img, @ByPtrPtr CvPoint pts, @Const IntPointer npts,
                         int contours, @ByVal CvScalar color );
public static native void cvFillPoly( CvArr img, @ByPtrPtr CvPoint pts, @Const IntPointer npts,
                         int contours, @ByVal CvScalar color,
                         int line_type/*=8*/, int shift/*=0*/ );
public static native void cvFillPoly( CvArr img, @Cast("CvPoint**") @ByPtrPtr IntBuffer pts, @Const IntBuffer npts,
                         int contours, @ByVal CvScalar color,
                         int line_type/*=8*/, int shift/*=0*/ );
public static native void cvFillPoly( CvArr img, @Cast("CvPoint**") @ByPtrPtr IntBuffer pts, @Const IntBuffer npts,
                         int contours, @ByVal CvScalar color );
public static native void cvFillPoly( CvArr img, @Cast("CvPoint**") @ByPtrPtr int[] pts, @Const int[] npts,
                         int contours, @ByVal CvScalar color,
                         int line_type/*=8*/, int shift/*=0*/ );
public static native void cvFillPoly( CvArr img, @Cast("CvPoint**") @ByPtrPtr int[] pts, @Const int[] npts,
                         int contours, @ByVal CvScalar color );

/** \brief Draws one or more polygonal curves
@see cv::polylines
*/
public static native void cvPolyLine( CvArr img, @Cast("CvPoint**") PointerPointer pts, @Const IntPointer npts, int contours,
                         int is_closed, @ByVal CvScalar color, int thickness/*=1*/,
                         int line_type/*=8*/, int shift/*=0*/ );
public static native void cvPolyLine( CvArr img, @ByPtrPtr CvPoint pts, @Const IntPointer npts, int contours,
                         int is_closed, @ByVal CvScalar color );
public static native void cvPolyLine( CvArr img, @ByPtrPtr CvPoint pts, @Const IntPointer npts, int contours,
                         int is_closed, @ByVal CvScalar color, int thickness/*=1*/,
                         int line_type/*=8*/, int shift/*=0*/ );
public static native void cvPolyLine( CvArr img, @Cast("CvPoint**") @ByPtrPtr IntBuffer pts, @Const IntBuffer npts, int contours,
                         int is_closed, @ByVal CvScalar color, int thickness/*=1*/,
                         int line_type/*=8*/, int shift/*=0*/ );
public static native void cvPolyLine( CvArr img, @Cast("CvPoint**") @ByPtrPtr IntBuffer pts, @Const IntBuffer npts, int contours,
                         int is_closed, @ByVal CvScalar color );
public static native void cvPolyLine( CvArr img, @Cast("CvPoint**") @ByPtrPtr int[] pts, @Const int[] npts, int contours,
                         int is_closed, @ByVal CvScalar color, int thickness/*=1*/,
                         int line_type/*=8*/, int shift/*=0*/ );
public static native void cvPolyLine( CvArr img, @Cast("CvPoint**") @ByPtrPtr int[] pts, @Const int[] npts, int contours,
                         int is_closed, @ByVal CvScalar color );

public static native void cvDrawRect(CvArr arg1, @ByVal CvPoint arg2, @ByVal CvPoint arg3, @ByVal CvScalar arg4, int arg5, int arg6, int arg7);
public static native void cvDrawRect(CvArr arg1, @ByVal @Cast("CvPoint*") IntBuffer arg2, @ByVal @Cast("CvPoint*") IntBuffer arg3, @ByVal CvScalar arg4, int arg5, int arg6, int arg7);
public static native void cvDrawRect(CvArr arg1, @ByVal @Cast("CvPoint*") int[] arg2, @ByVal @Cast("CvPoint*") int[] arg3, @ByVal CvScalar arg4, int arg5, int arg6, int arg7);
public static native void cvDrawLine(CvArr arg1, @ByVal CvPoint arg2, @ByVal CvPoint arg3, @ByVal CvScalar arg4, int arg5, int arg6, int arg7);
public static native void cvDrawLine(CvArr arg1, @ByVal @Cast("CvPoint*") IntBuffer arg2, @ByVal @Cast("CvPoint*") IntBuffer arg3, @ByVal CvScalar arg4, int arg5, int arg6, int arg7);
public static native void cvDrawLine(CvArr arg1, @ByVal @Cast("CvPoint*") int[] arg2, @ByVal @Cast("CvPoint*") int[] arg3, @ByVal CvScalar arg4, int arg5, int arg6, int arg7);
public static native void cvDrawCircle(CvArr arg1, @ByVal CvPoint arg2, int arg3, @ByVal CvScalar arg4, int arg5, int arg6, int arg7);
public static native void cvDrawCircle(CvArr arg1, @ByVal @Cast("CvPoint*") IntBuffer arg2, int arg3, @ByVal CvScalar arg4, int arg5, int arg6, int arg7);
public static native void cvDrawCircle(CvArr arg1, @ByVal @Cast("CvPoint*") int[] arg2, int arg3, @ByVal CvScalar arg4, int arg5, int arg6, int arg7);
public static native void cvDrawEllipse(CvArr arg1, @ByVal CvPoint arg2, @ByVal CvSize arg3, double arg4, double arg5, double arg6, @ByVal CvScalar arg7, int arg8, int arg9, int arg10);
public static native void cvDrawEllipse(CvArr arg1, @ByVal @Cast("CvPoint*") IntBuffer arg2, @ByVal CvSize arg3, double arg4, double arg5, double arg6, @ByVal CvScalar arg7, int arg8, int arg9, int arg10);
public static native void cvDrawEllipse(CvArr arg1, @ByVal @Cast("CvPoint*") int[] arg2, @ByVal CvSize arg3, double arg4, double arg5, double arg6, @ByVal CvScalar arg7, int arg8, int arg9, int arg10);
public static native void cvDrawPolyLine(CvArr arg1, @Cast("CvPoint**") PointerPointer arg2, IntPointer arg3, int arg4, int arg5, @ByVal CvScalar arg6, int arg7, int arg8, int arg9);
public static native void cvDrawPolyLine(CvArr arg1, @ByPtrPtr CvPoint arg2, IntPointer arg3, int arg4, int arg5, @ByVal CvScalar arg6, int arg7, int arg8, int arg9);
public static native void cvDrawPolyLine(CvArr arg1, @Cast("CvPoint**") @ByPtrPtr IntBuffer arg2, IntBuffer arg3, int arg4, int arg5, @ByVal CvScalar arg6, int arg7, int arg8, int arg9);
public static native void cvDrawPolyLine(CvArr arg1, @Cast("CvPoint**") @ByPtrPtr int[] arg2, int[] arg3, int arg4, int arg5, @ByVal CvScalar arg6, int arg7, int arg8, int arg9);

/** \brief Clips the line segment connecting *pt1 and *pt2
   by the rectangular window
   <p>
   (0<=x<img_size.width, 0<=y<img_size.height).
@see cv::clipLine
*/
public static native int cvClipLine( @ByVal CvSize img_size, CvPoint pt1, CvPoint pt2 );
public static native int cvClipLine( @ByVal CvSize img_size, @Cast("CvPoint*") IntBuffer pt1, @Cast("CvPoint*") IntBuffer pt2 );
public static native int cvClipLine( @ByVal CvSize img_size, @Cast("CvPoint*") int[] pt1, @Cast("CvPoint*") int[] pt2 );

/** \brief Initializes line iterator.
<p>
Initially, line_iterator->ptr will point to pt1 (or pt2, see left_to_right description) location in
the image. Returns the number of pixels on the line between the ending points.
@see cv::LineIterator
*/
public static native int cvInitLineIterator( @Const CvArr image, @ByVal CvPoint pt1, @ByVal CvPoint pt2,
                                CvLineIterator line_iterator,
                                int connectivity/*=8*/,
                                int left_to_right/*=0*/);
public static native int cvInitLineIterator( @Const CvArr image, @ByVal CvPoint pt1, @ByVal CvPoint pt2,
                                CvLineIterator line_iterator);
public static native int cvInitLineIterator( @Const CvArr image, @ByVal @Cast("CvPoint*") IntBuffer pt1, @ByVal @Cast("CvPoint*") IntBuffer pt2,
                                CvLineIterator line_iterator,
                                int connectivity/*=8*/,
                                int left_to_right/*=0*/);
public static native int cvInitLineIterator( @Const CvArr image, @ByVal @Cast("CvPoint*") IntBuffer pt1, @ByVal @Cast("CvPoint*") IntBuffer pt2,
                                CvLineIterator line_iterator);
public static native int cvInitLineIterator( @Const CvArr image, @ByVal @Cast("CvPoint*") int[] pt1, @ByVal @Cast("CvPoint*") int[] pt2,
                                CvLineIterator line_iterator,
                                int connectivity/*=8*/,
                                int left_to_right/*=0*/);
public static native int cvInitLineIterator( @Const CvArr image, @ByVal @Cast("CvPoint*") int[] pt1, @ByVal @Cast("CvPoint*") int[] pt2,
                                CvLineIterator line_iterator);

// #define CV_NEXT_LINE_POINT( line_iterator )
// {
//     int _line_iterator_mask = (line_iterator).err < 0 ? -1 : 0;
//     (line_iterator).err += (line_iterator).minus_delta +
//         ((line_iterator).plus_delta & _line_iterator_mask);
//     (line_iterator).ptr += (line_iterator).minus_step +
//         ((line_iterator).plus_step & _line_iterator_mask);
// }


public static final int CV_FONT_HERSHEY_SIMPLEX =         0;
public static final int CV_FONT_HERSHEY_PLAIN =           1;
public static final int CV_FONT_HERSHEY_DUPLEX =          2;
public static final int CV_FONT_HERSHEY_COMPLEX =         3;
public static final int CV_FONT_HERSHEY_TRIPLEX =         4;
public static final int CV_FONT_HERSHEY_COMPLEX_SMALL =   5;
public static final int CV_FONT_HERSHEY_SCRIPT_SIMPLEX =  6;
public static final int CV_FONT_HERSHEY_SCRIPT_COMPLEX =  7;

public static final int CV_FONT_ITALIC =                 16;

public static final int CV_FONT_VECTOR0 =    CV_FONT_HERSHEY_SIMPLEX;


/** Font structure */
public static class CvFont extends AbstractCvFont {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvFont() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CvFont(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvFont(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public CvFont position(int position) {
        return (CvFont)super.position(position);
    }

  @MemberGetter public native @Cast("const char*") BytePointer nameFont();   //Qt:nameFont
  public native @ByRef CvScalar color(); public native CvFont color(CvScalar color);       //Qt:ColorFont -> cvScalar(blue_component, green_component, red_component[, alpha_component])
    public native int font_face(); public native CvFont font_face(int font_face);    //Qt: bool italic         /** =CV_FONT_* */
    /** font data and metrics */
    @MemberGetter public native @Const IntPointer ascii();
    @MemberGetter public native @Const IntPointer greek();
    @MemberGetter public native @Const IntPointer cyrillic();
    public native float hscale(); public native CvFont hscale(float hscale);
    public native float vscale(); public native CvFont vscale(float vscale);
    /** slope coefficient: 0 - normal, >0 - italic */
    public native float shear(); public native CvFont shear(float shear);
    /** Qt: weight               /** letters thickness */
    public native int thickness(); public native CvFont thickness(int thickness);
    /** horizontal interval between letters */
    public native float dx(); public native CvFont dx(float dx);
    /** Qt: PointSize */
    public native int line_type(); public native CvFont line_type(int line_type);
}

/** \brief Initializes font structure (OpenCV 1.x API).
<p>
The function initializes the font structure that can be passed to text rendering functions.
<p>
@param font Pointer to the font structure initialized by the function
@param font_face Font name identifier. See cv::HersheyFonts and corresponding old CV_* identifiers.
@param hscale Horizontal scale. If equal to 1.0f , the characters have the original width
depending on the font type. If equal to 0.5f , the characters are of half the original width.
@param vscale Vertical scale. If equal to 1.0f , the characters have the original height depending
on the font type. If equal to 0.5f , the characters are of half the original height.
@param shear Approximate tangent of the character slope relative to the vertical line. A zero
value means a non-italic font, 1.0f means about a 45 degree slope, etc.
@param thickness Thickness of the text strokes
@param line_type Type of the strokes, see line description
<p>
\sa cvPutText
 */
public static native void cvInitFont( CvFont font, int font_face,
                         double hscale, double vscale,
                         double shear/*=0*/,
                         int thickness/*=1*/,
                         int line_type/*=8*/);
public static native void cvInitFont( CvFont font, int font_face,
                         double hscale, double vscale);

public static native @ByVal CvFont cvFont( double scale, int thickness/*=1*/ );
public static native @ByVal CvFont cvFont( double scale );

/** \brief Renders text stroke with specified font and color at specified location.
   CvFont should be initialized with cvInitFont
@see cvInitFont, cvGetTextSize, cvFont, cv::putText
*/
public static native void cvPutText( CvArr img, @Cast("const char*") BytePointer text, @ByVal CvPoint org,
                        @Const CvFont font, @ByVal CvScalar color );
public static native void cvPutText( CvArr img, String text, @ByVal @Cast("CvPoint*") IntBuffer org,
                        @Const CvFont font, @ByVal CvScalar color );
public static native void cvPutText( CvArr img, @Cast("const char*") BytePointer text, @ByVal @Cast("CvPoint*") int[] org,
                        @Const CvFont font, @ByVal CvScalar color );
public static native void cvPutText( CvArr img, String text, @ByVal CvPoint org,
                        @Const CvFont font, @ByVal CvScalar color );
public static native void cvPutText( CvArr img, @Cast("const char*") BytePointer text, @ByVal @Cast("CvPoint*") IntBuffer org,
                        @Const CvFont font, @ByVal CvScalar color );
public static native void cvPutText( CvArr img, String text, @ByVal @Cast("CvPoint*") int[] org,
                        @Const CvFont font, @ByVal CvScalar color );

/** \brief Calculates bounding box of text stroke (useful for alignment)
@see cv::getTextSize
*/
public static native void cvGetTextSize( @Cast("const char*") BytePointer text_string, @Const CvFont font,
                            CvSize text_size, IntPointer baseline );
public static native void cvGetTextSize( String text_string, @Const CvFont font,
                            CvSize text_size, IntBuffer baseline );
public static native void cvGetTextSize( @Cast("const char*") BytePointer text_string, @Const CvFont font,
                            CvSize text_size, int[] baseline );
public static native void cvGetTextSize( String text_string, @Const CvFont font,
                            CvSize text_size, IntPointer baseline );
public static native void cvGetTextSize( @Cast("const char*") BytePointer text_string, @Const CvFont font,
                            CvSize text_size, IntBuffer baseline );
public static native void cvGetTextSize( String text_string, @Const CvFont font,
                            CvSize text_size, int[] baseline );

/** \brief Unpacks color value
<p>
if arrtype is CV_8UC?, _color_ is treated as packed color value, otherwise the first channels
(depending on arrtype) of destination scalar are set to the same value = _color_
*/
public static native @ByVal CvScalar cvColorToScalar( double packed_color, int arrtype );

/** \brief Returns the polygon points which make up the given ellipse.
<p>
The ellipse is define by the box of size 'axes' rotated 'angle' around the 'center'. A partial
sweep of the ellipse arc can be done by spcifying arc_start and arc_end to be something other than
0 and 360, respectively. The input array 'pts' must be large enough to hold the result. The total
number of points stored into 'pts' is returned by this function.
@see cv::ellipse2Poly
*/
public static native int cvEllipse2Poly( @ByVal CvPoint center, @ByVal CvSize axes,
                 int angle, int arc_start, int arc_end, CvPoint pts, int delta );
public static native int cvEllipse2Poly( @ByVal @Cast("CvPoint*") IntBuffer center, @ByVal CvSize axes,
                 int angle, int arc_start, int arc_end, @Cast("CvPoint*") IntBuffer pts, int delta );
public static native int cvEllipse2Poly( @ByVal @Cast("CvPoint*") int[] center, @ByVal CvSize axes,
                 int angle, int arc_start, int arc_end, @Cast("CvPoint*") int[] pts, int delta );

/** \brief Draws contour outlines or filled interiors on the image
@see cv::drawContours
*/
public static native void cvDrawContours( CvArr img, CvSeq contour,
                             @ByVal CvScalar external_color, @ByVal CvScalar hole_color,
                             int max_level, int thickness/*=1*/,
                             int line_type/*=8*/,
                             @ByVal(nullValue = "cvPoint(0,0)") CvPoint offset/*=cvPoint(0,0)*/);
public static native void cvDrawContours( CvArr img, CvSeq contour,
                             @ByVal CvScalar external_color, @ByVal CvScalar hole_color,
                             int max_level);
public static native void cvDrawContours( CvArr img, CvSeq contour,
                             @ByVal CvScalar external_color, @ByVal CvScalar hole_color,
                             int max_level, int thickness/*=1*/,
                             int line_type/*=8*/,
                             @ByVal(nullValue = "cvPoint(0,0)") @Cast("CvPoint*") IntBuffer offset/*=cvPoint(0,0)*/);
public static native void cvDrawContours( CvArr img, CvSeq contour,
                             @ByVal CvScalar external_color, @ByVal CvScalar hole_color,
                             int max_level, int thickness/*=1*/,
                             int line_type/*=8*/,
                             @ByVal(nullValue = "cvPoint(0,0)") @Cast("CvPoint*") int[] offset/*=cvPoint(0,0)*/);

/** \} */

// #ifdef __cplusplus
// #endif

// #endif


// Parsed from <opencv2/imgproc.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_IMGPROC_HPP__
// #define __OPENCV_IMGPROC_HPP__

// #include "opencv2/core.hpp"

/**
  \defgroup imgproc Image processing
  \{
    \defgroup imgproc_filter Image Filtering
<p>
Functions and classes described in this section are used to perform various linear or non-linear
filtering operations on 2D images (represented as Mat's). It means that for each pixel location
\f$(x,y)\f$ in the source image (normally, rectangular), its neighborhood is considered and used to
compute the response. In case of a linear filter, it is a weighted sum of pixel values. In case of
morphological operations, it is the minimum or maximum values, and so on. The computed response is
stored in the destination image at the same location \f$(x,y)\f$. It means that the output image
will be of the same size as the input image. Normally, the functions support multi-channel arrays,
in which case every channel is processed independently. Therefore, the output image will also have
the same number of channels as the input one.
<p>
Another common feature of the functions and classes described in this section is that, unlike
simple arithmetic functions, they need to extrapolate values of some non-existing pixels. For
example, if you want to smooth an image using a Gaussian \f$3 \times 3\f$ filter, then, when
processing the left-most pixels in each row, you need pixels to the left of them, that is, outside
of the image. You can let these pixels be the same as the left-most image pixels ("replicated
border" extrapolation method), or assume that all the non-existing pixels are zeros ("constant
border" extrapolation method), and so on. OpenCV enables you to specify the extrapolation method.
For details, see cv::BorderTypes
<p>
\anchor filter_depths
### Depth combinations
Input depth (src.depth()) | Output depth (ddepth)
--------------------------|----------------------
CV_8U                     | -1/CV_16S/CV_32F/CV_64F
CV_16U/CV_16S             | -1/CV_32F/CV_64F
CV_32F                    | -1/CV_32F/CV_64F
CV_64F                    | -1/CV_64F
<p>
\note when ddepth=-1, the output image will have the same depth as the source.
    <p>
    \defgroup imgproc_transform Geometric Image Transformations
<p>
The functions in this section perform various geometrical transformations of 2D images. They do not
change the image content but deform the pixel grid and map this deformed grid to the destination
image. In fact, to avoid sampling artifacts, the mapping is done in the reverse order, from
destination to the source. That is, for each pixel \f$(x, y)\f$ of the destination image, the
functions compute coordinates of the corresponding "donor" pixel in the source image and copy the
pixel value:
<p>
\f[\texttt{dst} (x,y)= \texttt{src} (f_x(x,y), f_y(x,y))\f]
<p>
In case when you specify the forward mapping \f$\left<g_x, g_y\right>: \texttt{src} \rightarrow
\texttt{dst}\f$, the OpenCV functions first compute the corresponding inverse mapping
\f$\left<f_x, f_y\right>: \texttt{dst} \rightarrow \texttt{src}\f$ and then use the above formula.
<p>
The actual implementations of the geometrical transformations, from the most generic remap and to
the simplest and the fastest resize, need to solve two main problems with the above formula:
<p>
- Extrapolation of non-existing pixels. Similarly to the filtering functions described in the
previous section, for some \f$(x,y)\f$, either one of \f$f_x(x,y)\f$, or \f$f_y(x,y)\f$, or both
of them may fall outside of the image. In this case, an extrapolation method needs to be used.
OpenCV provides the same selection of extrapolation methods as in the filtering functions. In
addition, it provides the method BORDER_TRANSPARENT. This means that the corresponding pixels in
the destination image will not be modified at all.
<p>
- Interpolation of pixel values. Usually \f$f_x(x,y)\f$ and \f$f_y(x,y)\f$ are floating-point
numbers. This means that \f$\left<f_x, f_y\right>\f$ can be either an affine or perspective
transformation, or radial lens distortion correction, and so on. So, a pixel value at fractional
coordinates needs to be retrieved. In the simplest case, the coordinates can be just rounded to the
nearest integer coordinates and the corresponding pixel can be used. This is called a
nearest-neighbor interpolation. However, a better result can be achieved by using more
sophisticated [interpolation methods](http://en.wikipedia.org/wiki/Multivariate_interpolation) ,
where a polynomial function is fit into some neighborhood of the computed pixel \f$(f_x(x,y),
f_y(x,y))\f$, and then the value of the polynomial at \f$(f_x(x,y), f_y(x,y))\f$ is taken as the
interpolated pixel value. In OpenCV, you can choose between several interpolation methods. See
resize for details.
    <p>
    \defgroup imgproc_misc Miscellaneous Image Transformations
    \defgroup imgproc_draw Drawing Functions
<p>
Drawing functions work with matrices/images of arbitrary depth. The boundaries of the shapes can be
rendered with antialiasing (implemented only for 8-bit images for now). All the functions include
the parameter color that uses an RGB value (that may be constructed with the Scalar constructor )
for color images and brightness for grayscale images. For color images, the channel ordering is
normally *Blue, Green, Red*. This is what imshow, imread, and imwrite expect. So, if you form a
color using the Scalar constructor, it should look like:
<p>
\f[\texttt{Scalar} (blue \_ component, green \_ component, red \_ component[, alpha \_ component])\f]
<p>
If you are using your own image rendering and I/O functions, you can use any channel ordering. The
drawing functions process each channel independently and do not depend on the channel order or even
on the used color space. The whole image can be converted from BGR to RGB or to a different color
space using cvtColor .
<p>
If a drawn figure is partially or completely outside the image, the drawing functions clip it. Also,
many drawing functions can handle pixel coordinates specified with sub-pixel accuracy. This means
that the coordinates can be passed as fixed-point numbers encoded as integers. The number of
fractional bits is specified by the shift parameter and the real point coordinates are calculated as
\f$\texttt{Point}(x,y)\rightarrow\texttt{Point2f}(x*2^{-shift},y*2^{-shift})\f$ . This feature is
especially effective when rendering antialiased shapes.
<p>
\note The functions do not support alpha-transparency when the target image is 4-channel. In this
case, the color[3] is simply copied to the repainted pixels. Thus, if you want to paint
semi-transparent shapes, you can paint them in a separate buffer and then blend it with the main
image.
    <p>
    \defgroup imgproc_colormap ColorMaps in OpenCV
<p>
The human perception isn't built for observing fine changes in grayscale images. Human eyes are more
sensitive to observing changes between colors, so you often need to recolor your grayscale images to
get a clue about them. OpenCV now comes with various colormaps to enhance the visualization in your
computer vision application.
<p>
In OpenCV you only need applyColorMap to apply a colormap on a given image. The following sample
code reads the path to an image from command line, applies a Jet colormap on it and shows the
result:
<p>
<pre>{@code
#include <opencv2/core.hpp>
#include <opencv2/imgproc.hpp>
#include <opencv2/imgcodecs.hpp>
#include <opencv2/highgui.hpp>
using namespace cv;

#include <iostream>
using namespace std;

int main(int argc, const char *argv[])
{
    // We need an input image. (can be grayscale or color)
    if (argc < 2)
    {
        cerr << "We need an image to process here. Please run: colorMap [path_to_image]" << endl;
        return -1;
    }
    Mat img_in = imread(argv[1]);
    if(img_in.empty())
    {
        cerr << "Sample image (" << argv[1] << ") is empty. Please adjust your path, so it points to a valid input image!" << endl;
        return -1;
    }
    // Holds the colormap version of the image:
    Mat img_color;
    // Apply the colormap:
    applyColorMap(img_in, img_color, COLORMAP_JET);
    // Show the result:
    imshow("colorMap", img_color);
    waitKey(0);
    return 0;
}
}</pre>
<p>
@see cv::ColormapTypes
    <p>
    \defgroup imgproc_hist Histograms
    \defgroup imgproc_shape Structural Analysis and Shape Descriptors
    \defgroup imgproc_motion Motion Analysis and Object Tracking
    \defgroup imgproc_feature Feature Detection
    \defgroup imgproc_object Object Detection
    \defgroup imgproc_c C API
  \}
*/

/** \addtogroup imgproc
\{
*/

/** \addtogroup imgproc_filter
/** \{
<p>
/** type of morphological operation */
/** enum cv::MorphTypes */
public static final int
    /** see cv::erode */
    MORPH_ERODE    = 0,
    /** see cv::dilate */
    MORPH_DILATE   = 1,
    /** an opening operation
 *  \f[\texttt{dst} = \mathrm{open} ( \texttt{src} , \texttt{element} )= \mathrm{dilate} ( \mathrm{erode} ( \texttt{src} , \texttt{element} ))\f] */
    MORPH_OPEN     = 2,
    /** a closing operation
 *  \f[\texttt{dst} = \mathrm{close} ( \texttt{src} , \texttt{element} )= \mathrm{erode} ( \mathrm{dilate} ( \texttt{src} , \texttt{element} ))\f] */
    MORPH_CLOSE    = 3,
    /** a morphological gradient
 *  \f[\texttt{dst} = \mathrm{morph\_grad} ( \texttt{src} , \texttt{element} )= \mathrm{dilate} ( \texttt{src} , \texttt{element} )- \mathrm{erode} ( \texttt{src} , \texttt{element} )\f] */
    MORPH_GRADIENT = 4,
    /** "top hat"
 *  \f[\texttt{dst} = \mathrm{tophat} ( \texttt{src} , \texttt{element} )= \texttt{src} - \mathrm{open} ( \texttt{src} , \texttt{element} )\f] */
    MORPH_TOPHAT   = 5,
    /** "black hat"
 *  \f[\texttt{dst} = \mathrm{blackhat} ( \texttt{src} , \texttt{element} )= \mathrm{close} ( \texttt{src} , \texttt{element} )- \texttt{src}\f] */
    MORPH_BLACKHAT = 6,
    /** "hit and miss"
 *    .- Only supported for CV_8UC1 binary images. Tutorial can be found in [this page](http://opencv-code.com/tutorials/hit-or-miss-transform-in-opencv/) */
    MORPH_HITMISS  = 7;

/** shape of the structuring element */
/** enum cv::MorphShapes */
public static final int
    /** a rectangular structuring element:  \f[E_{ij}=1\f] */
    MORPH_RECT    = 0,
    /** a cross-shaped structuring element:
 *  \f[E_{ij} =  \fork{1}{if i=\texttt{anchor.y} or j=\texttt{anchor.x}}{0}{otherwise}\f] */
    MORPH_CROSS   = 1,
    /** an elliptic structuring element, that is, a filled ellipse inscribed
 *  into the rectangle Rect(0, 0, esize.width, 0.esize.height) */
    MORPH_ELLIPSE = 2;

/** \} imgproc_filter
 <p>
 *  \addtogroup imgproc_transform
 *  \{
 <p>
 *  interpolation algorithm */
/** enum cv::InterpolationFlags */
public static final int
    /** nearest neighbor interpolation */
    INTER_NEAREST        = 0,
    /** bilinear interpolation */
    INTER_LINEAR         = 1,
    /** bicubic interpolation */
    INTER_CUBIC          = 2,
    /** resampling using pixel area relation. It may be a preferred method for image decimation, as
    it gives moire'-free results. But when the image is zoomed, it is similar to the INTER_NEAREST
    method. */
    INTER_AREA           = 3,
    /** Lanczos interpolation over 8x8 neighborhood */
    INTER_LANCZOS4       = 4,
    /** mask for interpolation codes */
    INTER_MAX            = 7,
    /** flag, fills all of the destination image pixels. If some of them correspond to outliers in the
    source image, they are set to zero */
    WARP_FILL_OUTLIERS   = 8,
    /** flag, inverse transformation
    <p>
    For example, polar transforms:
    - flag is __not__ set: \f$dst( \phi , \rho ) = src(x,y)\f$
    - flag is set: \f$dst(x,y) = src( \phi , \rho )\f$
    */
    WARP_INVERSE_MAP     = 16;

/** enum cv::InterpolationMasks */
public static final int
       INTER_BITS      = 5,
       INTER_BITS2     =  INTER_BITS * 2,
       INTER_TAB_SIZE  =  1 << INTER_BITS,
       INTER_TAB_SIZE2 =  INTER_TAB_SIZE * INTER_TAB_SIZE;

/** \} imgproc_transform
 <p>
 *  \addtogroup imgproc_misc
 *  \{
 <p>
 *  Distance types for Distance Transform and M-estimators
 *  @see cv::distanceTransform, cv::fitLine */
/** enum cv::DistanceTypes */
public static final int
    /** User defined distance */
    DIST_USER    = -1,
    /** distance = |x1-x2| + |y1-y2| */
    DIST_L1      = 1,
    /** the simple euclidean distance */
    DIST_L2      = 2,
    /** distance = max(|x1-x2|,|y1-y2|) */
    DIST_C       = 3,
    /** L1-L2 metric: distance = 2(sqrt(1+x*x/2) - 1)) */
    DIST_L12     = 4,
    /** distance = c^2(|x|/c-log(1+|x|/c)), c = 1.3998 */
    DIST_FAIR    = 5,
    /** distance = c^2/2(1-exp(-(x/c)^2)), c = 2.9846 */
    DIST_WELSCH  = 6,
    /** distance = |x|<c ? x^2/2 : c(|x|-c/2), c=1.345 */
    DIST_HUBER   = 7;

/** Mask size for distance transform */
/** enum cv::DistanceTransformMasks */
public static final int
    /** mask=3 */
    DIST_MASK_3       = 3,
    /** mask=5 */
    DIST_MASK_5       = 5,
    //!<
    DIST_MASK_PRECISE = 0;

/** type of the threshold operation
 *  ![threshold types](pics/threshold.png) */
/** enum cv::ThresholdTypes */
public static final int
    /** \f[\texttt{dst} (x,y) =  \fork{\texttt{maxval}}{if \(\texttt{src}(x,y) > \texttt{thresh}\)}{0}{otherwise}\f] */
    THRESH_BINARY     = 0,
    /** \f[\texttt{dst} (x,y) =  \fork{0}{if \(\texttt{src}(x,y) > \texttt{thresh}\)}{\texttt{maxval}}{otherwise}\f] */
    THRESH_BINARY_INV = 1,
    /** \f[\texttt{dst} (x,y) =  \fork{\texttt{threshold}}{if \(\texttt{src}(x,y) > \texttt{thresh}\)}{\texttt{src}(x,y)}{otherwise}\f] */
    THRESH_TRUNC      = 2,
    /** \f[\texttt{dst} (x,y) =  \fork{\texttt{src}(x,y)}{if \(\texttt{src}(x,y) > \texttt{thresh}\)}{0}{otherwise}\f] */
    THRESH_TOZERO     = 3,
    /** \f[\texttt{dst} (x,y) =  \fork{0}{if \(\texttt{src}(x,y) > \texttt{thresh}\)}{\texttt{src}(x,y)}{otherwise}\f] */
    THRESH_TOZERO_INV = 4,
    THRESH_MASK       = 7,
    /** flag, use Otsu algorithm to choose the optimal threshold value */
    THRESH_OTSU       = 8,
    /** flag, use Triangle algorithm to choose the optimal threshold value */
    THRESH_TRIANGLE   = 16;

/** adaptive threshold algorithm
 *  see cv::adaptiveThreshold */
/** enum cv::AdaptiveThresholdTypes */
public static final int
    /** the threshold value \f$T(x,y)\f$ is a mean of the \f$\texttt{blockSize} \times
    \texttt{blockSize}\f$ neighborhood of \f$(x, y)\f$ minus C */
    ADAPTIVE_THRESH_MEAN_C     = 0,
    /** the threshold value \f$T(x, y)\f$ is a weighted sum (cross-correlation with a Gaussian
    window) of the \f$\texttt{blockSize} \times \texttt{blockSize}\f$ neighborhood of \f$(x, y)\f$
    minus C . The default sigma (standard deviation) is used for the specified blockSize . See
    cv::getGaussianKernel*/
    ADAPTIVE_THRESH_GAUSSIAN_C = 1;

/** cv::undistort mode */
/** enum cv::UndistortTypes */
public static final int
       PROJ_SPHERICAL_ORTHO  = 0,
       PROJ_SPHERICAL_EQRECT = 1;

/** class of the pixel in GrabCut algorithm */
/** enum cv::GrabCutClasses */
public static final int
    /** an obvious background pixels */
    GC_BGD    = 0,
    /** an obvious foreground (object) pixel */
    GC_FGD    = 1,
    /** a possible background pixel */
    GC_PR_BGD = 2,
    /** a possible foreground pixel */
    GC_PR_FGD = 3;

/** GrabCut algorithm flags */
/** enum cv::GrabCutModes */
public static final int
    /** The function initializes the state and the mask using the provided rectangle. After that it
    runs iterCount iterations of the algorithm. */
    GC_INIT_WITH_RECT  = 0,
    /** The function initializes the state using the provided mask. Note that GC_INIT_WITH_RECT
    and GC_INIT_WITH_MASK can be combined. Then, all the pixels outside of the ROI are
    automatically initialized with GC_BGD .*/
    GC_INIT_WITH_MASK  = 1,
    /** The value means that the algorithm should just resume. */
    GC_EVAL            = 2;

/** distanceTransform algorithm flags */
/** enum cv::DistanceTransformLabelTypes */
public static final int
    /** each connected component of zeros in src (as well as all the non-zero pixels closest to the
    connected component) will be assigned the same label */
    DIST_LABEL_CCOMP = 0,
    /** each zero pixel (and all the non-zero pixels closest to it) gets its own label. */
    DIST_LABEL_PIXEL = 1;

/** floodfill algorithm flags */
/** enum cv::FloodFillFlags */
public static final int
    /** If set, the difference between the current pixel and seed pixel is considered. Otherwise,
    the difference between neighbor pixels is considered (that is, the range is floating). */
    FLOODFILL_FIXED_RANGE =  1 << 16,
    /** If set, the function does not change the image ( newVal is ignored), and only fills the
    mask with the value specified in bits 8-16 of flags as described above. This option only make
    sense in function variants that have the mask parameter. */
    FLOODFILL_MASK_ONLY   =  1 << 17;

/** \} imgproc_misc
 <p>
 *  \addtogroup imgproc_shape
 *  \{
 <p>
 *  connected components algorithm output formats */
/** enum cv::ConnectedComponentsTypes */
public static final int
    /** The leftmost (x) coordinate which is the inclusive start of the bounding
 *  box in the horizontal direction. */
    CC_STAT_LEFT   = 0,
    /** The topmost (y) coordinate which is the inclusive start of the bounding
 *  box in the vertical direction. */
    CC_STAT_TOP    = 1,
    /** The horizontal size of the bounding box */
    CC_STAT_WIDTH  = 2,
    /** The vertical size of the bounding box */
    CC_STAT_HEIGHT = 3,
    /** The total area (in pixels) of the connected component */
    CC_STAT_AREA   = 4,
    CC_STAT_MAX    = 5;

/** mode of the contour retrieval algorithm */
/** enum cv::RetrievalModes */
public static final int
    /** retrieves only the extreme outer contours. It sets {@code hierarchy[i][2]=hierarchy[i][3]=-1} for
    all the contours. */
    RETR_EXTERNAL  = 0,
    /** retrieves all of the contours without establishing any hierarchical relationships. */
    RETR_LIST      = 1,
    /** retrieves all of the contours and organizes them into a two-level hierarchy. At the top
    level, there are external boundaries of the components. At the second level, there are
    boundaries of the holes. If there is another contour inside a hole of a connected component, it
    is still put at the top level. */
    RETR_CCOMP     = 2,
    /** retrieves all of the contours and reconstructs a full hierarchy of nested contours.*/
    RETR_TREE      = 3,
    //!<
    RETR_FLOODFILL = 4;

/** the contour approximation algorithm */
/** enum cv::ContourApproximationModes */
public static final int
    /** stores absolutely all the contour points. That is, any 2 subsequent points (x1,y1) and
    (x2,y2) of the contour will be either horizontal, vertical or diagonal neighbors, that is,
    max(abs(x1-x2),abs(y2-y1))==1. */
    CHAIN_APPROX_NONE      = 1,
    /** compresses horizontal, vertical, and diagonal segments and leaves only their end points.
    For example, an up-right rectangular contour is encoded with 4 points. */
    CHAIN_APPROX_SIMPLE    = 2,
    /** applies one of the flavors of the Teh-Chin chain approximation algorithm \cite TehChin89 */
    CHAIN_APPROX_TC89_L1   = 3,
    /** applies one of the flavors of the Teh-Chin chain approximation algorithm \cite TehChin89 */
    CHAIN_APPROX_TC89_KCOS = 4;

/** \} imgproc_shape
 <p>
 *  Variants of a Hough transform */
/** enum cv::HoughModes */
public static final int

    /** classical or standard Hough transform. Every line is represented by two floating-point
    numbers \f$(\rho, \theta)\f$ , where \f$\rho\f$ is a distance between (0,0) point and the line,
    and \f$\theta\f$ is the angle between x-axis and the normal to the line. Thus, the matrix must
    be (the created sequence will be) of CV_32FC2 type */
    HOUGH_STANDARD      = 0,
    /** probabilistic Hough transform (more efficient in case if the picture contains a few long
    linear segments). It returns line segments rather than the whole line. Each segment is
    represented by starting and ending points, and the matrix must be (the created sequence will
    be) of the CV_32SC4 type. */
    HOUGH_PROBABILISTIC = 1,
    /** multi-scale variant of the classical Hough transform. The lines are encoded the same way as
    HOUGH_STANDARD. */
    HOUGH_MULTI_SCALE   = 2,
    /** basically *21HT*, described in \cite Yuen90 */
    HOUGH_GRADIENT      = 3;

/** Variants of Line Segment %Detector
 *  \ingroup imgproc_feature */
/** enum cv::LineSegmentDetectorModes */
public static final int
    /** No refinement applied */
    LSD_REFINE_NONE = 0,
    /** Standard refinement is applied. E.g. breaking arches into smaller straighter line approximations. */
    LSD_REFINE_STD  = 1,
    /** Advanced refinement. Number of false alarms is calculated, lines are
 *  refined through increase of precision, decrement in size, etc. */
    LSD_REFINE_ADV  = 2;

/** Histogram comparison methods
  \ingroup imgproc_hist
*/
/** enum cv::HistCompMethods */
public static final int
    /** Correlation
    \f[d(H_1,H_2) =  \frac{\sum_I (H_1(I) - \bar{H_1}) (H_2(I) - \bar{H_2})}{\sqrt{\sum_I(H_1(I) - \bar{H_1})^2 \sum_I(H_2(I) - \bar{H_2})^2}}\f]
    where
    \f[\bar{H_k} =  \frac{1}{N} \sum _J H_k(J)\f]
    and \f$N\f$ is a total number of histogram bins. */
    HISTCMP_CORREL        = 0,
    /** Chi-Square
    \f[d(H_1,H_2) =  \sum _I  \frac{\left(H_1(I)-H_2(I)\right)^2}{H_1(I)}\f] */
    HISTCMP_CHISQR        = 1,
    /** Intersection
    \f[d(H_1,H_2) =  \sum _I  \min (H_1(I), H_2(I))\f] */
    HISTCMP_INTERSECT     = 2,
    /** Bhattacharyya distance
    (In fact, OpenCV computes Hellinger distance, which is related to Bhattacharyya coefficient.)
    \f[d(H_1,H_2) =  \sqrt{1 - \frac{1}{\sqrt{\bar{H_1} \bar{H_2} N^2}} \sum_I \sqrt{H_1(I) \cdot H_2(I)}}\f] */
    HISTCMP_BHATTACHARYYA = 3,
    /** Synonym for HISTCMP_BHATTACHARYYA */
    HISTCMP_HELLINGER     =  HISTCMP_BHATTACHARYYA,
    /** Alternative Chi-Square
    \f[d(H_1,H_2) =  2 * \sum _I  \frac{\left(H_1(I)-H_2(I)\right)^2}{H_1(I)+H_2(I)}\f]
    This alternative formula is regularly used for texture comparison. See e.g. \cite Puzicha1997 */
    HISTCMP_CHISQR_ALT    = 4,
    /** Kullback-Leibler divergence
    \f[d(H_1,H_2) = \sum _I H_1(I) \log \left(\frac{H_1(I)}{H_2(I)}\right)\f] */
    HISTCMP_KL_DIV        = 5;

/** the color conversion code
@see \ref imgproc_color_conversions
\ingroup imgproc_misc
 */
/** enum cv::ColorConversionCodes */
public static final int
    /** add alpha channel to RGB or BGR image */
    COLOR_BGR2BGRA     = 0,
    COLOR_RGB2RGBA     =  COLOR_BGR2BGRA,

    /** remove alpha channel from RGB or BGR image */
    COLOR_BGRA2BGR     = 1,
    COLOR_RGBA2RGB     =  COLOR_BGRA2BGR,

    /** convert between RGB and BGR color spaces (with or without alpha channel) */
    COLOR_BGR2RGBA     = 2,
    COLOR_RGB2BGRA     =  COLOR_BGR2RGBA,

    COLOR_RGBA2BGR     = 3,
    COLOR_BGRA2RGB     =  COLOR_RGBA2BGR,

    COLOR_BGR2RGB      = 4,
    COLOR_RGB2BGR      =  COLOR_BGR2RGB,

    COLOR_BGRA2RGBA    = 5,
    COLOR_RGBA2BGRA    =  COLOR_BGRA2RGBA,

    /** convert between RGB/BGR and grayscale, \ref color_convert_rgb_gray "color conversions" */
    COLOR_BGR2GRAY     = 6,
    COLOR_RGB2GRAY     = 7,
    COLOR_GRAY2BGR     = 8,
    COLOR_GRAY2RGB     =  COLOR_GRAY2BGR,
    COLOR_GRAY2BGRA    = 9,
    COLOR_GRAY2RGBA    =  COLOR_GRAY2BGRA,
    COLOR_BGRA2GRAY    = 10,
    COLOR_RGBA2GRAY    = 11,

    /** convert between RGB/BGR and BGR565 (16-bit images) */
    COLOR_BGR2BGR565   = 12,
    COLOR_RGB2BGR565   = 13,
    COLOR_BGR5652BGR   = 14,
    COLOR_BGR5652RGB   = 15,
    COLOR_BGRA2BGR565  = 16,
    COLOR_RGBA2BGR565  = 17,
    COLOR_BGR5652BGRA  = 18,
    COLOR_BGR5652RGBA  = 19,

    /** convert between grayscale to BGR565 (16-bit images) */
    COLOR_GRAY2BGR565  = 20,
    COLOR_BGR5652GRAY  = 21,

    /** convert between RGB/BGR and BGR555 (16-bit images) */
    COLOR_BGR2BGR555   = 22,
    COLOR_RGB2BGR555   = 23,
    COLOR_BGR5552BGR   = 24,
    COLOR_BGR5552RGB   = 25,
    COLOR_BGRA2BGR555  = 26,
    COLOR_RGBA2BGR555  = 27,
    COLOR_BGR5552BGRA  = 28,
    COLOR_BGR5552RGBA  = 29,

    /** convert between grayscale and BGR555 (16-bit images) */
    COLOR_GRAY2BGR555  = 30,
    COLOR_BGR5552GRAY  = 31,

    /** convert RGB/BGR to CIE XYZ, \ref color_convert_rgb_xyz "color conversions" */
    COLOR_BGR2XYZ      = 32,
    COLOR_RGB2XYZ      = 33,
    COLOR_XYZ2BGR      = 34,
    COLOR_XYZ2RGB      = 35,

    /** convert RGB/BGR to luma-chroma (aka YCC), \ref color_convert_rgb_ycrcb "color conversions" */
    COLOR_BGR2YCrCb    = 36,
    COLOR_RGB2YCrCb    = 37,
    COLOR_YCrCb2BGR    = 38,
    COLOR_YCrCb2RGB    = 39,

    /** convert RGB/BGR to HSV (hue saturation value), \ref color_convert_rgb_hsv "color conversions" */
    COLOR_BGR2HSV      = 40,
    COLOR_RGB2HSV      = 41,

    /** convert RGB/BGR to CIE Lab, \ref color_convert_rgb_lab "color conversions" */
    COLOR_BGR2Lab      = 44,
    COLOR_RGB2Lab      = 45,

    /** convert RGB/BGR to CIE Luv, \ref color_convert_rgb_luv "color conversions" */
    COLOR_BGR2Luv      = 50,
    COLOR_RGB2Luv      = 51,
    /** convert RGB/BGR to HLS (hue lightness saturation), \ref color_convert_rgb_hls "color conversions" */
    COLOR_BGR2HLS      = 52,
    COLOR_RGB2HLS      = 53,

    /** backward conversions to RGB/BGR */
    COLOR_HSV2BGR      = 54,
    COLOR_HSV2RGB      = 55,

    COLOR_Lab2BGR      = 56,
    COLOR_Lab2RGB      = 57,
    COLOR_Luv2BGR      = 58,
    COLOR_Luv2RGB      = 59,
    COLOR_HLS2BGR      = 60,
    COLOR_HLS2RGB      = 61,

    //!<
    COLOR_BGR2HSV_FULL = 66,
    COLOR_RGB2HSV_FULL = 67,
    COLOR_BGR2HLS_FULL = 68,
    COLOR_RGB2HLS_FULL = 69,

    COLOR_HSV2BGR_FULL = 70,
    COLOR_HSV2RGB_FULL = 71,
    COLOR_HLS2BGR_FULL = 72,
    COLOR_HLS2RGB_FULL = 73,

    COLOR_LBGR2Lab     = 74,
    COLOR_LRGB2Lab     = 75,
    COLOR_LBGR2Luv     = 76,
    COLOR_LRGB2Luv     = 77,

    COLOR_Lab2LBGR     = 78,
    COLOR_Lab2LRGB     = 79,
    COLOR_Luv2LBGR     = 80,
    COLOR_Luv2LRGB     = 81,

    /** convert between RGB/BGR and YUV */
    COLOR_BGR2YUV      = 82,
    COLOR_RGB2YUV      = 83,
    COLOR_YUV2BGR      = 84,
    COLOR_YUV2RGB      = 85,

    /** YUV 4:2:0 family to RGB */
    COLOR_YUV2RGB_NV12  = 90,
    COLOR_YUV2BGR_NV12  = 91,
    COLOR_YUV2RGB_NV21  = 92,
    COLOR_YUV2BGR_NV21  = 93,
    COLOR_YUV420sp2RGB  =  COLOR_YUV2RGB_NV21,
    COLOR_YUV420sp2BGR  =  COLOR_YUV2BGR_NV21,

    COLOR_YUV2RGBA_NV12 = 94,
    COLOR_YUV2BGRA_NV12 = 95,
    COLOR_YUV2RGBA_NV21 = 96,
    COLOR_YUV2BGRA_NV21 = 97,
    COLOR_YUV420sp2RGBA =  COLOR_YUV2RGBA_NV21,
    COLOR_YUV420sp2BGRA =  COLOR_YUV2BGRA_NV21,

    COLOR_YUV2RGB_YV12  = 98,
    COLOR_YUV2BGR_YV12  = 99,
    COLOR_YUV2RGB_IYUV  = 100,
    COLOR_YUV2BGR_IYUV  = 101,
    COLOR_YUV2RGB_I420  =  COLOR_YUV2RGB_IYUV,
    COLOR_YUV2BGR_I420  =  COLOR_YUV2BGR_IYUV,
    COLOR_YUV420p2RGB   =  COLOR_YUV2RGB_YV12,
    COLOR_YUV420p2BGR   =  COLOR_YUV2BGR_YV12,

    COLOR_YUV2RGBA_YV12 = 102,
    COLOR_YUV2BGRA_YV12 = 103,
    COLOR_YUV2RGBA_IYUV = 104,
    COLOR_YUV2BGRA_IYUV = 105,
    COLOR_YUV2RGBA_I420 =  COLOR_YUV2RGBA_IYUV,
    COLOR_YUV2BGRA_I420 =  COLOR_YUV2BGRA_IYUV,
    COLOR_YUV420p2RGBA  =  COLOR_YUV2RGBA_YV12,
    COLOR_YUV420p2BGRA  =  COLOR_YUV2BGRA_YV12,

    COLOR_YUV2GRAY_420  = 106,
    COLOR_YUV2GRAY_NV21 =  COLOR_YUV2GRAY_420,
    COLOR_YUV2GRAY_NV12 =  COLOR_YUV2GRAY_420,
    COLOR_YUV2GRAY_YV12 =  COLOR_YUV2GRAY_420,
    COLOR_YUV2GRAY_IYUV =  COLOR_YUV2GRAY_420,
    COLOR_YUV2GRAY_I420 =  COLOR_YUV2GRAY_420,
    COLOR_YUV420sp2GRAY =  COLOR_YUV2GRAY_420,
    COLOR_YUV420p2GRAY  =  COLOR_YUV2GRAY_420,

    /** YUV 4:2:2 family to RGB */
    COLOR_YUV2RGB_UYVY = 107,
    COLOR_YUV2BGR_UYVY = 108,
    //COLOR_YUV2RGB_VYUY = 109,
    //COLOR_YUV2BGR_VYUY = 110,
    COLOR_YUV2RGB_Y422 =  COLOR_YUV2RGB_UYVY,
    COLOR_YUV2BGR_Y422 =  COLOR_YUV2BGR_UYVY,
    COLOR_YUV2RGB_UYNV =  COLOR_YUV2RGB_UYVY,
    COLOR_YUV2BGR_UYNV =  COLOR_YUV2BGR_UYVY,

    COLOR_YUV2RGBA_UYVY = 111,
    COLOR_YUV2BGRA_UYVY = 112,
    //COLOR_YUV2RGBA_VYUY = 113,
    //COLOR_YUV2BGRA_VYUY = 114,
    COLOR_YUV2RGBA_Y422 =  COLOR_YUV2RGBA_UYVY,
    COLOR_YUV2BGRA_Y422 =  COLOR_YUV2BGRA_UYVY,
    COLOR_YUV2RGBA_UYNV =  COLOR_YUV2RGBA_UYVY,
    COLOR_YUV2BGRA_UYNV =  COLOR_YUV2BGRA_UYVY,

    COLOR_YUV2RGB_YUY2 = 115,
    COLOR_YUV2BGR_YUY2 = 116,
    COLOR_YUV2RGB_YVYU = 117,
    COLOR_YUV2BGR_YVYU = 118,
    COLOR_YUV2RGB_YUYV =  COLOR_YUV2RGB_YUY2,
    COLOR_YUV2BGR_YUYV =  COLOR_YUV2BGR_YUY2,
    COLOR_YUV2RGB_YUNV =  COLOR_YUV2RGB_YUY2,
    COLOR_YUV2BGR_YUNV =  COLOR_YUV2BGR_YUY2,

    COLOR_YUV2RGBA_YUY2 = 119,
    COLOR_YUV2BGRA_YUY2 = 120,
    COLOR_YUV2RGBA_YVYU = 121,
    COLOR_YUV2BGRA_YVYU = 122,
    COLOR_YUV2RGBA_YUYV =  COLOR_YUV2RGBA_YUY2,
    COLOR_YUV2BGRA_YUYV =  COLOR_YUV2BGRA_YUY2,
    COLOR_YUV2RGBA_YUNV =  COLOR_YUV2RGBA_YUY2,
    COLOR_YUV2BGRA_YUNV =  COLOR_YUV2BGRA_YUY2,

    COLOR_YUV2GRAY_UYVY = 123,
    COLOR_YUV2GRAY_YUY2 = 124,
    //CV_YUV2GRAY_VYUY    = CV_YUV2GRAY_UYVY,
    COLOR_YUV2GRAY_Y422 =  COLOR_YUV2GRAY_UYVY,
    COLOR_YUV2GRAY_UYNV =  COLOR_YUV2GRAY_UYVY,
    COLOR_YUV2GRAY_YVYU =  COLOR_YUV2GRAY_YUY2,
    COLOR_YUV2GRAY_YUYV =  COLOR_YUV2GRAY_YUY2,
    COLOR_YUV2GRAY_YUNV =  COLOR_YUV2GRAY_YUY2,

    /** alpha premultiplication */
    COLOR_RGBA2mRGBA    = 125,
    COLOR_mRGBA2RGBA    = 126,

    /** RGB to YUV 4:2:0 family */
    COLOR_RGB2YUV_I420  = 127,
    COLOR_BGR2YUV_I420  = 128,
    COLOR_RGB2YUV_IYUV  =  COLOR_RGB2YUV_I420,
    COLOR_BGR2YUV_IYUV  =  COLOR_BGR2YUV_I420,

    COLOR_RGBA2YUV_I420 = 129,
    COLOR_BGRA2YUV_I420 = 130,
    COLOR_RGBA2YUV_IYUV =  COLOR_RGBA2YUV_I420,
    COLOR_BGRA2YUV_IYUV =  COLOR_BGRA2YUV_I420,
    COLOR_RGB2YUV_YV12  = 131,
    COLOR_BGR2YUV_YV12  = 132,
    COLOR_RGBA2YUV_YV12 = 133,
    COLOR_BGRA2YUV_YV12 = 134,

    /** Demosaicing */
    COLOR_BayerBG2BGR = 46,
    COLOR_BayerGB2BGR = 47,
    COLOR_BayerRG2BGR = 48,
    COLOR_BayerGR2BGR = 49,

    COLOR_BayerBG2RGB =  COLOR_BayerRG2BGR,
    COLOR_BayerGB2RGB =  COLOR_BayerGR2BGR,
    COLOR_BayerRG2RGB =  COLOR_BayerBG2BGR,
    COLOR_BayerGR2RGB =  COLOR_BayerGB2BGR,

    COLOR_BayerBG2GRAY = 86,
    COLOR_BayerGB2GRAY = 87,
    COLOR_BayerRG2GRAY = 88,
    COLOR_BayerGR2GRAY = 89,

    /** Demosaicing using Variable Number of Gradients */
    COLOR_BayerBG2BGR_VNG = 62,
    COLOR_BayerGB2BGR_VNG = 63,
    COLOR_BayerRG2BGR_VNG = 64,
    COLOR_BayerGR2BGR_VNG = 65,

    COLOR_BayerBG2RGB_VNG =  COLOR_BayerRG2BGR_VNG,
    COLOR_BayerGB2RGB_VNG =  COLOR_BayerGR2BGR_VNG,
    COLOR_BayerRG2RGB_VNG =  COLOR_BayerBG2BGR_VNG,
    COLOR_BayerGR2RGB_VNG =  COLOR_BayerGB2BGR_VNG,

    /** Edge-Aware Demosaicing */
    COLOR_BayerBG2BGR_EA  = 135,
    COLOR_BayerGB2BGR_EA  = 136,
    COLOR_BayerRG2BGR_EA  = 137,
    COLOR_BayerGR2BGR_EA  = 138,

    COLOR_BayerBG2RGB_EA  =  COLOR_BayerRG2BGR_EA,
    COLOR_BayerGB2RGB_EA  =  COLOR_BayerGR2BGR_EA,
    COLOR_BayerRG2RGB_EA  =  COLOR_BayerBG2BGR_EA,
    COLOR_BayerGR2RGB_EA  =  COLOR_BayerGB2BGR_EA,


    COLOR_COLORCVT_MAX  = 139;

/** types of intersection between rectangles
\ingroup imgproc_shape
*/
/** enum cv::RectanglesIntersectTypes */
public static final int
    /** No intersection */
    INTERSECT_NONE = 0,
    /** There is a partial intersection */
    INTERSECT_PARTIAL  = 1,
    /** One of the rectangle is fully enclosed in the other */
    INTERSECT_FULL  = 2;

/** finds arbitrary template in the grayscale image using Generalized Hough Transform */
@Namespace("cv") public static class GeneralizedHough extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GeneralizedHough(Pointer p) { super(p); }

    /** set template to search */
    public native void setTemplate(@ByVal Mat templ, @ByVal(nullValue = "cv::Point(-1, -1)") Point templCenter/*=cv::Point(-1, -1)*/);
    public native void setTemplate(@ByVal Mat templ);
    public native void setTemplate(@ByVal Mat edges, @ByVal Mat dx, @ByVal Mat dy, @ByVal(nullValue = "cv::Point(-1, -1)") Point templCenter/*=cv::Point(-1, -1)*/);
    public native void setTemplate(@ByVal Mat edges, @ByVal Mat dx, @ByVal Mat dy);

    /** find template on image */
    public native void detect(@ByVal Mat image, @ByVal Mat positions, @ByVal(nullValue = "cv::noArray()") Mat votes/*=cv::noArray()*/);
    public native void detect(@ByVal Mat image, @ByVal Mat positions);
    public native void detect(@ByVal Mat edges, @ByVal Mat dx, @ByVal Mat dy, @ByVal Mat positions, @ByVal(nullValue = "cv::noArray()") Mat votes/*=cv::noArray()*/);
    public native void detect(@ByVal Mat edges, @ByVal Mat dx, @ByVal Mat dy, @ByVal Mat positions);

    /** Canny low threshold. */
    public native void setCannyLowThresh(int cannyLowThresh);
    public native int getCannyLowThresh();

    /** Canny high threshold. */
    public native void setCannyHighThresh(int cannyHighThresh);
    public native int getCannyHighThresh();

    /** Minimum distance between the centers of the detected objects. */
    public native void setMinDist(double minDist);
    public native double getMinDist();

    /** Inverse ratio of the accumulator resolution to the image resolution. */
    public native void setDp(double dp);
    public native double getDp();

    /** Maximal size of inner buffers. */
    public native void setMaxBufferSize(int maxBufferSize);
    public native int getMaxBufferSize();
}

/** Ballard, D.H. (1981). Generalizing the Hough transform to detect arbitrary shapes. Pattern Recognition 13 (2): 111-122.
 *  Detects position only without traslation and rotation */
@Namespace("cv") public static class GeneralizedHoughBallard extends GeneralizedHough {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GeneralizedHoughBallard(Pointer p) { super(p); }

    /** R-Table levels. */
    public native void setLevels(int levels);
    public native int getLevels();

    /** The accumulator threshold for the template centers at the detection stage. The smaller it is, the more false positions may be detected. */
    public native void setVotesThreshold(int votesThreshold);
    public native int getVotesThreshold();
}

/** Guil, N., González-Linares, J.M. and Zapata, E.L. (1999). Bidimensional shape detection using an invariant approach. Pattern Recognition 32 (6): 1025-1038.
 *  Detects position, traslation and rotation */
@Namespace("cv") public static class GeneralizedHoughGuil extends GeneralizedHough {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GeneralizedHoughGuil(Pointer p) { super(p); }

    /** Angle difference in degrees between two points in feature. */
    public native void setXi(double xi);
    public native double getXi();

    /** Feature table levels. */
    public native void setLevels(int levels);
    public native int getLevels();

    /** Maximal difference between angles that treated as equal. */
    public native void setAngleEpsilon(double angleEpsilon);
    public native double getAngleEpsilon();

    /** Minimal rotation angle to detect in degrees. */
    public native void setMinAngle(double minAngle);
    public native double getMinAngle();

    /** Maximal rotation angle to detect in degrees. */
    public native void setMaxAngle(double maxAngle);
    public native double getMaxAngle();

    /** Angle step in degrees. */
    public native void setAngleStep(double angleStep);
    public native double getAngleStep();

    /** Angle votes threshold. */
    public native void setAngleThresh(int angleThresh);
    public native int getAngleThresh();

    /** Minimal scale to detect. */
    public native void setMinScale(double minScale);
    public native double getMinScale();

    /** Maximal scale to detect. */
    public native void setMaxScale(double maxScale);
    public native double getMaxScale();

    /** Scale step. */
    public native void setScaleStep(double scaleStep);
    public native double getScaleStep();

    /** Scale votes threshold. */
    public native void setScaleThresh(int scaleThresh);
    public native int getScaleThresh();

    /** Position votes threshold. */
    public native void setPosThresh(int posThresh);
    public native int getPosThresh();
}


@Namespace("cv") public static class CLAHE extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CLAHE(Pointer p) { super(p); }

    public native void apply(@ByVal Mat src, @ByVal Mat dst);

    public native void setClipLimit(double clipLimit);
    public native double getClipLimit();

    public native void setTilesGridSize(@ByVal Size tileGridSize);
    public native @ByVal Size getTilesGridSize();

    public native void collectGarbage();
}


@Namespace("cv") @NoOffset public static class Subdiv2D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Subdiv2D(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Subdiv2D(int size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Subdiv2D position(int position) {
        return (Subdiv2D)super.position(position);
    }

    /** enum cv::Subdiv2D:: */
    public static final int PTLOC_ERROR        = -2,
           PTLOC_OUTSIDE_RECT = -1,
           PTLOC_INSIDE       = 0,
           PTLOC_VERTEX       = 1,
           PTLOC_ON_EDGE      = 2;

    /** enum cv::Subdiv2D:: */
    public static final int NEXT_AROUND_ORG   =  0x00,
           NEXT_AROUND_DST   =  0x22,
           PREV_AROUND_ORG   =  0x11,
           PREV_AROUND_DST   =  0x33,
           NEXT_AROUND_LEFT  =  0x13,
           NEXT_AROUND_RIGHT =  0x31,
           PREV_AROUND_LEFT  =  0x20,
           PREV_AROUND_RIGHT =  0x02;

    public Subdiv2D() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Subdiv2D(@ByVal Rect rect) { super((Pointer)null); allocate(rect); }
    private native void allocate(@ByVal Rect rect);
    public native void initDelaunay(@ByVal Rect rect);

    public native int insert(@ByVal Point2f pt);
    public native void insert(@Const @ByRef Point2fVector ptvec);
    public native int locate(@ByVal Point2f pt, @ByRef IntPointer edge, @ByRef IntPointer vertex);
    public native int locate(@ByVal Point2f pt, @ByRef IntBuffer edge, @ByRef IntBuffer vertex);
    public native int locate(@ByVal Point2f pt, @ByRef int[] edge, @ByRef int[] vertex);

    public native int findNearest(@ByVal Point2f pt, Point2f nearestPt/*=0*/);
    public native int findNearest(@ByVal Point2f pt);
    public native void getEdgeList(@Cast("cv::Vec4f*") @StdVector FloatPointer edgeList);
    public native void getTriangleList(@Cast("cv::Vec6f*") @StdVector FloatPointer triangleList);
    public native void getVoronoiFacetList(@StdVector IntPointer idx, @ByRef Point2fVectorVector facetList,
                                         @ByRef Point2fVector facetCenters);
    public native void getVoronoiFacetList(@StdVector IntBuffer idx, @ByRef Point2fVectorVector facetList,
                                         @ByRef Point2fVector facetCenters);
    public native void getVoronoiFacetList(@StdVector int[] idx, @ByRef Point2fVectorVector facetList,
                                         @ByRef Point2fVector facetCenters);

    public native @ByVal Point2f getVertex(int vertex, IntPointer firstEdge/*=0*/);
    public native @ByVal Point2f getVertex(int vertex);
    public native @ByVal Point2f getVertex(int vertex, IntBuffer firstEdge/*=0*/);
    public native @ByVal Point2f getVertex(int vertex, int[] firstEdge/*=0*/);

    public native int getEdge( int edge, int nextEdgeType );
    public native int nextEdge(int edge);
    public native int rotateEdge(int edge, int rotate);
    public native int symEdge(int edge);
    public native int edgeOrg(int edge, Point2f orgpt/*=0*/);
    public native int edgeOrg(int edge);
    public native int edgeDst(int edge, Point2f dstpt/*=0*/);
    public native int edgeDst(int edge);
}

/** \addtogroup imgproc_feature
 *  \{
<p>
/** \example lsd_lines.cpp
An example using the LineSegmentDetector
*/

/** \brief Line segment detector class
<p>
following the algorithm described at \cite Rafael12 .
*/
@Namespace("cv") public static class LineSegmentDetector extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LineSegmentDetector(Pointer p) { super(p); }


    /** \brief Finds lines in the input image.
    <p>
    This is the output of the default parameters of the algorithm on the above shown image.
    <p>
    ![image](pics/building_lsd.png)
    <p>
    @param _image A grayscale (CV_8UC1) input image. If only a roi needs to be selected, use:
    {@code lsd_ptr-\>detect(image(roi), lines, ...); lines += Scalar(roi.x, roi.y, roi.x, roi.y);}
    @param _lines A vector of Vec4i or Vec4f elements specifying the beginning and ending point of a line. Where
    Vec4i/Vec4f is (x1, y1, x2, y2), point 1 is the start, point 2 - end. Returned lines are strictly
    oriented depending on the gradient.
    @param width Vector of widths of the regions, where the lines are found. E.g. Width of line.
    @param prec Vector of precisions with which the lines are found.
    @param nfa Vector containing number of false alarms in the line region, with precision of 10%. The
    bigger the value, logarithmically better the detection.
    - -1 corresponds to 10 mean false alarms
    - 0 corresponds to 1 mean false alarm
    - 1 corresponds to 0.1 mean false alarms
    This vector will be calculated only when the objects type is LSD_REFINE_ADV.
    */
    public native void detect(@ByVal Mat _image, @ByVal Mat _lines,
                            @ByVal(nullValue = "cv::noArray()") Mat width/*=cv::noArray()*/, @ByVal(nullValue = "cv::noArray()") Mat prec/*=cv::noArray()*/,
                            @ByVal(nullValue = "cv::noArray()") Mat nfa/*=cv::noArray()*/);
    public native void detect(@ByVal Mat _image, @ByVal Mat _lines);

    /** \brief Draws the line segments on a given image.
    @param _image The image, where the liens will be drawn. Should be bigger or equal to the image,
    where the lines were found.
    @param lines A vector of the lines that needed to be drawn.
     */
    public native void drawSegments(@ByVal Mat _image, @ByVal Mat lines);

    /** \brief Draws two groups of lines in blue and red, counting the non overlapping (mismatching) pixels.
    <p>
    @param size The size of the image, where lines1 and lines2 were found.
    @param lines1 The first group of lines that needs to be drawn. It is visualized in blue color.
    @param lines2 The second group of lines. They visualized in red color.
    @param _image Optional image, where the lines will be drawn. The image should be color(3-channel)
    in order for lines1 and lines2 to be drawn in the above mentioned colors.
     */
    public native int compareSegments(@Const @ByRef Size size, @ByVal Mat lines1, @ByVal Mat lines2, @ByVal(nullValue = "cv::noArray()") Mat _image/*=cv::noArray()*/);
    public native int compareSegments(@Const @ByRef Size size, @ByVal Mat lines1, @ByVal Mat lines2);
}

/** \brief Creates a smart pointer to a LineSegmentDetector object and initializes it.
<p>
The LineSegmentDetector algorithm is defined using the standard values. Only advanced users may want
to edit those, as to tailor it for their own application.
<p>
@param _refine The way found lines will be refined, see cv::LineSegmentDetectorModes
@param _scale The scale of the image that will be used to find the lines. Range (0..1].
@param _sigma_scale Sigma for Gaussian filter. It is computed as sigma = _sigma_scale/_scale.
@param _quant Bound to the quantization error on the gradient norm.
@param _ang_th Gradient angle tolerance in degrees.
@param _log_eps Detection threshold: -log10(NFA) \> log_eps. Used only when advancent refinement
is chosen.
@param _density_th Minimal density of aligned region points in the enclosing rectangle.
@param _n_bins Number of bins in pseudo-ordering of gradient modulus.
 */
@Namespace("cv") public static native @Ptr LineSegmentDetector createLineSegmentDetector(
    int _refine/*=cv::LSD_REFINE_STD*/, double _scale/*=0.8*/,
    double _sigma_scale/*=0.6*/, double _quant/*=2.0*/, double _ang_th/*=22.5*/,
    double _log_eps/*=0*/, double _density_th/*=0.7*/, int _n_bins/*=1024*/);
@Namespace("cv") public static native @Ptr LineSegmentDetector createLineSegmentDetector();

/** \} imgproc_feature
 <p>
 *  \addtogroup imgproc_filter
 *  \{
<p>
/** \brief Returns Gaussian filter coefficients.
<p>
The function computes and returns the \f$\texttt{ksize} \times 1\f$ matrix of Gaussian filter
coefficients:
<p>
\f[G_i= \alpha *e^{-(i-( \texttt{ksize} -1)/2)^2/(2* \texttt{sigma}^2)},\f]
<p>
where \f$i=0..\texttt{ksize}-1\f$ and \f$\alpha\f$ is the scale factor chosen so that \f$\sum_i G_i=1\f$.
<p>
Two of such generated kernels can be passed to sepFilter2D. Those functions automatically recognize
smoothing kernels (a symmetrical kernel with sum of weights equal to 1) and handle them accordingly.
You may also use the higher-level GaussianBlur.
@param ksize Aperture size. It should be odd ( \f$\texttt{ksize} \mod 2 = 1\f$ ) and positive.
@param sigma Gaussian standard deviation. If it is non-positive, it is computed from ksize as
{@code sigma = 0.3\*((ksize-1)\*0.5 - 1) + 0.8}.
@param ktype Type of filter coefficients. It can be CV_32F or CV_64F .
\sa  sepFilter2D, getDerivKernels, getStructuringElement, GaussianBlur
 */
@Namespace("cv") public static native @ByVal Mat getGaussianKernel( int ksize, double sigma, int ktype/*=CV_64F*/ );
@Namespace("cv") public static native @ByVal Mat getGaussianKernel( int ksize, double sigma );

/** \brief Returns filter coefficients for computing spatial image derivatives.
<p>
The function computes and returns the filter coefficients for spatial image derivatives. When
{@code ksize=CV_SCHARR}, the Scharr \f$3 \times 3\f$ kernels are generated (see cv::Scharr). Otherwise, Sobel
kernels are generated (see cv::Sobel). The filters are normally passed to sepFilter2D or to
<p>
@param kx Output matrix of row filter coefficients. It has the type ktype .
@param ky Output matrix of column filter coefficients. It has the type ktype .
@param dx Derivative order in respect of x.
@param dy Derivative order in respect of y.
@param ksize Aperture size. It can be CV_SCHARR, 1, 3, 5, or 7.
@param normalize Flag indicating whether to normalize (scale down) the filter coefficients or not.
Theoretically, the coefficients should have the denominator \f$=2^{ksize*2-dx-dy-2}\f$. If you are
going to filter floating-point images, you are likely to use the normalized kernels. But if you
compute derivatives of an 8-bit image, store the results in a 16-bit image, and wish to preserve
all the fractional bits, you may want to set normalize=false .
@param ktype Type of filter coefficients. It can be CV_32f or CV_64F .
 */
@Namespace("cv") public static native void getDerivKernels( @ByVal Mat kx, @ByVal Mat ky,
                                   int dx, int dy, int ksize,
                                   @Cast("bool") boolean normalize/*=false*/, int ktype/*=CV_32F*/ );
@Namespace("cv") public static native void getDerivKernels( @ByVal Mat kx, @ByVal Mat ky,
                                   int dx, int dy, int ksize );

/** \brief Returns Gabor filter coefficients.
<p>
For more details about gabor filter equations and parameters, see: [Gabor
Filter](http://en.wikipedia.org/wiki/Gabor_filter).
<p>
@param ksize Size of the filter returned.
@param sigma Standard deviation of the gaussian envelope.
@param theta Orientation of the normal to the parallel stripes of a Gabor function.
@param lambd Wavelength of the sinusoidal factor.
@param gamma Spatial aspect ratio.
@param psi Phase offset.
@param ktype Type of filter coefficients. It can be CV_32F or CV_64F .
 */
@Namespace("cv") public static native @ByVal Mat getGaborKernel( @ByVal Size ksize, double sigma, double theta, double lambd,
                                 double gamma, double psi/*=CV_PI*0.5*/, int ktype/*=CV_64F*/ );
@Namespace("cv") public static native @ByVal Mat getGaborKernel( @ByVal Size ksize, double sigma, double theta, double lambd,
                                 double gamma );

/** returns "magic" border value for erosion and dilation. It is automatically transformed to Scalar::all(-DBL_MAX) for dilation. */
@Namespace("cv") public static native @ByVal Scalar morphologyDefaultBorderValue();

/** \brief Returns a structuring element of the specified size and shape for morphological operations.
<p>
The function constructs and returns the structuring element that can be further passed to cv::erode,
cv::dilate or cv::morphologyEx. But you can also construct an arbitrary binary mask yourself and use it as
the structuring element.
<p>
@param shape Element shape that could be one of cv::MorphShapes
@param ksize Size of the structuring element.
@param anchor Anchor position within the element. The default value \f$(-1, -1)\f$ means that the
anchor is at the center. Note that only the shape of a cross-shaped element depends on the anchor
position. In other cases the anchor just regulates how much the result of the morphological
operation is shifted.
 */
@Namespace("cv") public static native @ByVal Mat getStructuringElement(int shape, @ByVal Size ksize, @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor/*=cv::Point(-1,-1)*/);
@Namespace("cv") public static native @ByVal Mat getStructuringElement(int shape, @ByVal Size ksize);

/** \brief Blurs an image using the median filter.
<p>
The function smoothes an image using the median filter with the \f$\texttt{ksize} \times
\texttt{ksize}\f$ aperture. Each channel of a multi-channel image is processed independently.
In-place operation is supported.
<p>
@param src input 1-, 3-, or 4-channel image; when ksize is 3 or 5, the image depth should be
CV_8U, CV_16U, or CV_32F, for larger aperture sizes, it can only be CV_8U.
@param dst destination array of the same size and type as src.
@param ksize aperture linear size; it must be odd and greater than 1, for example: 3, 5, 7 ...
\sa  bilateralFilter, blur, boxFilter, GaussianBlur
 */
@Namespace("cv") public static native void medianBlur( @ByVal Mat src, @ByVal Mat dst, int ksize );

/** \brief Blurs an image using a Gaussian filter.
<p>
The function convolves the source image with the specified Gaussian kernel. In-place filtering is
supported.
<p>
@param src input image; the image can have any number of channels, which are processed
independently, but the depth should be CV_8U, CV_16U, CV_16S, CV_32F or CV_64F.
@param dst output image of the same size and type as src.
@param ksize Gaussian kernel size. ksize.width and ksize.height can differ but they both must be
positive and odd. Or, they can be zero's and then they are computed from sigma.
@param sigmaX Gaussian kernel standard deviation in X direction.
@param sigmaY Gaussian kernel standard deviation in Y direction; if sigmaY is zero, it is set to be
equal to sigmaX, if both sigmas are zeros, they are computed from ksize.width and ksize.height,
respectively (see cv::getGaussianKernel for details); to fully control the result regardless of
possible future modifications of all this semantics, it is recommended to specify all of ksize,
sigmaX, and sigmaY.
@param borderType pixel extrapolation method, see cv::BorderTypes
<p>
\sa  sepFilter2D, filter2D, blur, boxFilter, bilateralFilter, medianBlur
 */
@Namespace("cv") public static native void GaussianBlur( @ByVal Mat src, @ByVal Mat dst, @ByVal Size ksize,
                                double sigmaX, double sigmaY/*=0*/,
                                int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void GaussianBlur( @ByVal Mat src, @ByVal Mat dst, @ByVal Size ksize,
                                double sigmaX );

/** \brief Applies the bilateral filter to an image.
<p>
The function applies bilateral filtering to the input image, as described in
http://www.dai.ed.ac.uk/CVonline/LOCAL_COPIES/MANDUCHI1/Bilateral_Filtering.html
bilateralFilter can reduce unwanted noise very well while keeping edges fairly sharp. However, it is
very slow compared to most filters.
<p>
_Sigma values_: For simplicity, you can set the 2 sigma values to be the same. If they are small (\<
10), the filter will not have much effect, whereas if they are large (\> 150), they will have a very
strong effect, making the image look "cartoonish".
<p>
_Filter size_: Large filters (d \> 5) are very slow, so it is recommended to use d=5 for real-time
applications, and perhaps d=9 for offline applications that need heavy noise filtering.
<p>
This filter does not work inplace.
@param src Source 8-bit or floating-point, 1-channel or 3-channel image.
@param dst Destination image of the same size and type as src .
@param d Diameter of each pixel neighborhood that is used during filtering. If it is non-positive,
it is computed from sigmaSpace.
@param sigmaColor Filter sigma in the color space. A larger value of the parameter means that
farther colors within the pixel neighborhood (see sigmaSpace) will be mixed together, resulting
in larger areas of semi-equal color.
@param sigmaSpace Filter sigma in the coordinate space. A larger value of the parameter means that
farther pixels will influence each other as long as their colors are close enough (see sigmaColor
). When d\>0, it specifies the neighborhood size regardless of sigmaSpace. Otherwise, d is
proportional to sigmaSpace.
@param borderType border mode used to extrapolate pixels outside of the image, see cv::BorderTypes
 */
@Namespace("cv") public static native void bilateralFilter( @ByVal Mat src, @ByVal Mat dst, int d,
                                   double sigmaColor, double sigmaSpace,
                                   int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void bilateralFilter( @ByVal Mat src, @ByVal Mat dst, int d,
                                   double sigmaColor, double sigmaSpace );

/** \brief Blurs an image using the box filter.
<p>
The function smoothes an image using the kernel:
<p>
\f[\texttt{K} =  \alpha \begin{bmatrix} 1 & 1 & 1 &  \cdots & 1 & 1  \\ 1 & 1 & 1 &  \cdots & 1 & 1  \\ \hdotsfor{6} \\ 1 & 1 & 1 &  \cdots & 1 & 1 \end{bmatrix}\f]
<p>
where
<p>
\f[\alpha = \fork{\frac{1}{\texttt{ksize.width*ksize.height}}}{when \texttt{normalize=true}}{1}{otherwise}\f]
<p>
Unnormalized box filter is useful for computing various integral characteristics over each pixel
neighborhood, such as covariance matrices of image derivatives (used in dense optical flow
algorithms, and so on). If you need to compute pixel sums over variable-size windows, use cv::integral.
<p>
@param src input image.
@param dst output image of the same size and type as src.
@param ddepth the output image depth (-1 to use src.depth()).
@param ksize blurring kernel size.
@param anchor anchor point; default value Point(-1,-1) means that the anchor is at the kernel
center.
@param normalize flag, specifying whether the kernel is normalized by its area or not.
@param borderType border mode used to extrapolate pixels outside of the image, see cv::BorderTypes
\sa  blur, bilateralFilter, GaussianBlur, medianBlur, integral
 */
@Namespace("cv") public static native void boxFilter( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                             @ByVal Size ksize, @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor/*=cv::Point(-1,-1)*/,
                             @Cast("bool") boolean normalize/*=true*/,
                             int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void boxFilter( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                             @ByVal Size ksize );

/** \brief Calculates the normalized sum of squares of the pixel values overlapping the filter.
<p>
For every pixel \f$ (x, y) \f$ in the source image, the function calculates the sum of squares of those neighboring
pixel values which overlap the filter placed over the pixel \f$ (x, y) \f$.
<p>
The unnormalized square box filter can be useful in computing local image statistics such as the the local
variance and standard deviation around the neighborhood of a pixel.
<p>
@param _src input image
@param _dst output image of the same size and type as _src
@param ddepth the output image depth (-1 to use src.depth())
@param ksize kernel size
@param anchor kernel anchor point. The default value of Point(-1, -1) denotes that the anchor is at the kernel
center.
@param normalize flag, specifying whether the kernel is to be normalized by it's area or not.
@param borderType border mode used to extrapolate pixels outside of the image, see cv::BorderTypes
\sa boxFilter
*/
@Namespace("cv") public static native void sqrBoxFilter( @ByVal Mat _src, @ByVal Mat _dst, int ddepth,
                                @ByVal Size ksize, @ByVal(nullValue = "cv::Point(-1, -1)") Point anchor/*=cv::Point(-1, -1)*/,
                                @Cast("bool") boolean normalize/*=true*/,
                                int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void sqrBoxFilter( @ByVal Mat _src, @ByVal Mat _dst, int ddepth,
                                @ByVal Size ksize );

/** \brief Blurs an image using the normalized box filter.
<p>
The function smoothes an image using the kernel:
<p>
\f[\texttt{K} =  \frac{1}{\texttt{ksize.width*ksize.height}} \begin{bmatrix} 1 & 1 & 1 &  \cdots & 1 & 1  \\ 1 & 1 & 1 &  \cdots & 1 & 1  \\ \hdotsfor{6} \\ 1 & 1 & 1 &  \cdots & 1 & 1  \\ \end{bmatrix}\f]
<p>
The call {@code blur(src, dst, ksize, anchor, borderType)} is equivalent to {@code boxFilter(src, dst, src.type(),
anchor, true, borderType)}.
<p>
@param src input image; it can have any number of channels, which are processed independently, but
the depth should be CV_8U, CV_16U, CV_16S, CV_32F or CV_64F.
@param dst output image of the same size and type as src.
@param ksize blurring kernel size.
@param anchor anchor point; default value Point(-1,-1) means that the anchor is at the kernel
center.
@param borderType border mode used to extrapolate pixels outside of the image, see cv::BorderTypes
\sa  boxFilter, bilateralFilter, GaussianBlur, medianBlur
 */
@Namespace("cv") public static native void blur( @ByVal Mat src, @ByVal Mat dst,
                        @ByVal Size ksize, @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor/*=cv::Point(-1,-1)*/,
                        int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void blur( @ByVal Mat src, @ByVal Mat dst,
                        @ByVal Size ksize );

/** \brief Convolves an image with the kernel.
<p>
The function applies an arbitrary linear filter to an image. In-place operation is supported. When
the aperture is partially outside the image, the function interpolates outlier pixel values
according to the specified border mode.
<p>
The function does actually compute correlation, not the convolution:
<p>
\f[\texttt{dst} (x,y) =  \sum _{ \stackrel{0\leq x' < \texttt{kernel.cols},}{0\leq y' < \texttt{kernel.rows}} }  \texttt{kernel} (x',y')* \texttt{src} (x+x'- \texttt{anchor.x} ,y+y'- \texttt{anchor.y} )\f]
<p>
That is, the kernel is not mirrored around the anchor point. If you need a real convolution, flip
the kernel using cv::flip and set the new anchor to {@code (kernel.cols - anchor.x - 1, kernel.rows -
anchor.y - 1)}.
<p>
The function uses the DFT-based algorithm in case of sufficiently large kernels (~{@code 11 x 11} or
larger) and the direct algorithm for small kernels.
<p>
@param src input image.
@param dst output image of the same size and the same number of channels as src.
@param ddepth desired depth of the destination image, see \ref filter_depths "combinations"
@param kernel convolution kernel (or rather a correlation kernel), a single-channel floating point
matrix; if you want to apply different kernels to different channels, split the image into
separate color planes using split and process them individually.
@param anchor anchor of the kernel that indicates the relative position of a filtered point within
the kernel; the anchor should lie within the kernel; default value (-1,-1) means that the anchor
is at the kernel center.
@param delta optional value added to the filtered pixels before storing them in dst.
@param borderType pixel extrapolation method, see cv::BorderTypes
\sa  sepFilter2D, dft, matchTemplate
 */
@Namespace("cv") public static native void filter2D( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                            @ByVal Mat kernel, @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor/*=cv::Point(-1,-1)*/,
                            double delta/*=0*/, int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void filter2D( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                            @ByVal Mat kernel );

/** \brief Applies a separable linear filter to an image.
<p>
The function applies a separable linear filter to the image. That is, first, every row of src is
filtered with the 1D kernel kernelX. Then, every column of the result is filtered with the 1D
kernel kernelY. The final result shifted by delta is stored in dst .
<p>
@param src Source image.
@param dst Destination image of the same size and the same number of channels as src .
@param ddepth Destination image depth, see \ref filter_depths "combinations"
@param kernelX Coefficients for filtering each row.
@param kernelY Coefficients for filtering each column.
@param anchor Anchor position within the kernel. The default value \f$(-1,-1)\f$ means that the anchor
is at the kernel center.
@param delta Value added to the filtered results before storing them.
@param borderType Pixel extrapolation method, see cv::BorderTypes
\sa  filter2D, Sobel, GaussianBlur, boxFilter, blur
 */
@Namespace("cv") public static native void sepFilter2D( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                               @ByVal Mat kernelX, @ByVal Mat kernelY,
                               @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor/*=cv::Point(-1,-1)*/,
                               double delta/*=0*/, int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void sepFilter2D( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                               @ByVal Mat kernelX, @ByVal Mat kernelY );

/** \brief Calculates the first, second, third, or mixed image derivatives using an extended Sobel operator.
<p>
In all cases except one, the \f$\texttt{ksize} \times \texttt{ksize}\f$ separable kernel is used to
calculate the derivative. When \f$\texttt{ksize = 1}\f$, the \f$3 \times 1\f$ or \f$1 \times 3\f$
kernel is used (that is, no Gaussian smoothing is done). {@code ksize = 1} can only be used for the first
or the second x- or y- derivatives.
<p>
There is also the special value {@code ksize = CV_SCHARR (-1)} that corresponds to the \f$3\times3\f$ Scharr
filter that may give more accurate results than the \f$3\times3\f$ Sobel. The Scharr aperture is
<p>
\f[\vecthreethree{-3}{0}{3}{-10}{0}{10}{-3}{0}{3}\f]
<p>
for the x-derivative, or transposed for the y-derivative.
<p>
The function calculates an image derivative by convolving the image with the appropriate kernel:
<p>
\f[\texttt{dst} =  \frac{\partial^{xorder+yorder} \texttt{src}}{\partial x^{xorder} \partial y^{yorder}}\f]
<p>
The Sobel operators combine Gaussian smoothing and differentiation, so the result is more or less
resistant to the noise. Most often, the function is called with ( xorder = 1, yorder = 0, ksize = 3)
or ( xorder = 0, yorder = 1, ksize = 3) to calculate the first x- or y- image derivative. The first
case corresponds to a kernel of:
<p>
\f[\vecthreethree{-1}{0}{1}{-2}{0}{2}{-1}{0}{1}\f]
<p>
The second case corresponds to a kernel of:
<p>
\f[\vecthreethree{-1}{-2}{-1}{0}{0}{0}{1}{2}{1}\f]
<p>
@param src input image.
@param dst output image of the same size and the same number of channels as src .
@param ddepth output image depth, see \ref filter_depths "combinations"; in the case of
    8-bit input images it will result in truncated derivatives.
@param dx order of the derivative x.
@param dy order of the derivative y.
@param ksize size of the extended Sobel kernel; it must be 1, 3, 5, or 7.
@param scale optional scale factor for the computed derivative values; by default, no scaling is
applied (see cv::getDerivKernels for details).
@param delta optional delta value that is added to the results prior to storing them in dst.
@param borderType pixel extrapolation method, see cv::BorderTypes
\sa  Scharr, Laplacian, sepFilter2D, filter2D, GaussianBlur, cartToPolar
 */
@Namespace("cv") public static native void Sobel( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                         int dx, int dy, int ksize/*=3*/,
                         double scale/*=1*/, double delta/*=0*/,
                         int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void Sobel( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                         int dx, int dy );

/** \brief Calculates the first order image derivative in both x and y using a Sobel operator
<p>
Equivalent to calling:
<p>
<pre>{@code
Sobel( src, dx, CV_16SC1, 1, 0, 3 );
Sobel( src, dy, CV_16SC1, 0, 1, 3 );
}</pre>
<p>
@param src input image.
@param dx output image with first-order derivative in x.
@param dy output image with first-order derivative in y.
@param ksize size of Sobel kernel. It must be 3.
@param borderType pixel extrapolation method, see cv::BorderTypes
<p>
\sa Sobel
 */

@Namespace("cv") public static native void spatialGradient( @ByVal Mat src, @ByVal Mat dx,
                                   @ByVal Mat dy, int ksize/*=3*/,
                                   int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void spatialGradient( @ByVal Mat src, @ByVal Mat dx,
                                   @ByVal Mat dy );

/** \brief Calculates the first x- or y- image derivative using Scharr operator.
<p>
The function computes the first x- or y- spatial image derivative using the Scharr operator. The
call
<p>
\f[\texttt{Scharr(src, dst, ddepth, dx, dy, scale, delta, borderType)}\f]
<p>
is equivalent to
<p>
\f[\texttt{Sobel(src, dst, ddepth, dx, dy, CV\_SCHARR, scale, delta, borderType)} .\f]
<p>
@param src input image.
@param dst output image of the same size and the same number of channels as src.
@param ddepth output image depth, see \ref filter_depths "combinations"
@param dx order of the derivative x.
@param dy order of the derivative y.
@param scale optional scale factor for the computed derivative values; by default, no scaling is
applied (see getDerivKernels for details).
@param delta optional delta value that is added to the results prior to storing them in dst.
@param borderType pixel extrapolation method, see cv::BorderTypes
\sa  cartToPolar
 */
@Namespace("cv") public static native void Scharr( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                          int dx, int dy, double scale/*=1*/, double delta/*=0*/,
                          int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void Scharr( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                          int dx, int dy );

/** \example laplace.cpp
  An example using Laplace transformations for edge detection
*/

/** \brief Calculates the Laplacian of an image.
<p>
The function calculates the Laplacian of the source image by adding up the second x and y
derivatives calculated using the Sobel operator:
<p>
\f[\texttt{dst} =  \Delta \texttt{src} =  \frac{\partial^2 \texttt{src}}{\partial x^2} +  \frac{\partial^2 \texttt{src}}{\partial y^2}\f]
<p>
This is done when {@code ksize > 1}. When {@code ksize == 1}, the Laplacian is computed by filtering the image
with the following \f$3 \times 3\f$ aperture:
<p>
\f[\vecthreethree {0}{1}{0}{1}{-4}{1}{0}{1}{0}\f]
<p>
@param src Source image.
@param dst Destination image of the same size and the same number of channels as src .
@param ddepth Desired depth of the destination image.
@param ksize Aperture size used to compute the second-derivative filters. See getDerivKernels for
details. The size must be positive and odd.
@param scale Optional scale factor for the computed Laplacian values. By default, no scaling is
applied. See getDerivKernels for details.
@param delta Optional delta value that is added to the results prior to storing them in dst .
@param borderType Pixel extrapolation method, see cv::BorderTypes
\sa  Sobel, Scharr
 */
@Namespace("cv") public static native void Laplacian( @ByVal Mat src, @ByVal Mat dst, int ddepth,
                             int ksize/*=1*/, double scale/*=1*/, double delta/*=0*/,
                             int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void Laplacian( @ByVal Mat src, @ByVal Mat dst, int ddepth );

/** \} imgproc_filter
 <p>
 *  \addtogroup imgproc_feature
 *  \{
<p>
/** \example edge.cpp
  An example on using the canny edge detector
*/

/** \brief Finds edges in an image using the Canny algorithm \cite Canny86 .
<p>
The function finds edges in the input image image and marks them in the output map edges using the
Canny algorithm. The smallest value between threshold1 and threshold2 is used for edge linking. The
largest value is used to find initial segments of strong edges. See
<http://en.wikipedia.org/wiki/Canny_edge_detector>
<p>
@param image 8-bit input image.
@param edges output edge map; single channels 8-bit image, which has the same size as image .
@param threshold1 first threshold for the hysteresis procedure.
@param threshold2 second threshold for the hysteresis procedure.
@param apertureSize aperture size for the Sobel operator.
@param L2gradient a flag, indicating whether a more accurate \f$L_2\f$ norm
\f$=\sqrt{(dI/dx)^2 + (dI/dy)^2}\f$ should be used to calculate the image gradient magnitude (
L2gradient=true ), or whether the default \f$L_1\f$ norm \f$=|dI/dx|+|dI/dy|\f$ is enough (
L2gradient=false ).
 */
@Namespace("cv") public static native void Canny( @ByVal Mat image, @ByVal Mat edges,
                         double threshold1, double threshold2,
                         int apertureSize/*=3*/, @Cast("bool") boolean L2gradient/*=false*/ );
@Namespace("cv") public static native void Canny( @ByVal Mat image, @ByVal Mat edges,
                         double threshold1, double threshold2 );

/** \brief Calculates the minimal eigenvalue of gradient matrices for corner detection.
<p>
The function is similar to cornerEigenValsAndVecs but it calculates and stores only the minimal
eigenvalue of the covariance matrix of derivatives, that is, \f$\min(\lambda_1, \lambda_2)\f$ in terms
of the formulae in the cornerEigenValsAndVecs description.
<p>
@param src Input single-channel 8-bit or floating-point image.
@param dst Image to store the minimal eigenvalues. It has the type CV_32FC1 and the same size as
src .
@param blockSize Neighborhood size (see the details on cornerEigenValsAndVecs ).
@param ksize Aperture parameter for the Sobel operator.
@param borderType Pixel extrapolation method. See cv::BorderTypes.
 */
@Namespace("cv") public static native void cornerMinEigenVal( @ByVal Mat src, @ByVal Mat dst,
                                     int blockSize, int ksize/*=3*/,
                                     int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void cornerMinEigenVal( @ByVal Mat src, @ByVal Mat dst,
                                     int blockSize );

/** \brief Harris corner detector.
<p>
The function runs the Harris corner detector on the image. Similarly to cornerMinEigenVal and
cornerEigenValsAndVecs , for each pixel \f$(x, y)\f$ it calculates a \f$2\times2\f$ gradient covariance
matrix \f$M^{(x,y)}\f$ over a \f$\texttt{blockSize} \times \texttt{blockSize}\f$ neighborhood. Then, it
computes the following characteristic:
<p>
\f[\texttt{dst} (x,y) =  \mathrm{det} M^{(x,y)} - k  \cdot \left ( \mathrm{tr} M^{(x,y)} \right )^2\f]
<p>
Corners in the image can be found as the local maxima of this response map.
<p>
@param src Input single-channel 8-bit or floating-point image.
@param dst Image to store the Harris detector responses. It has the type CV_32FC1 and the same
size as src .
@param blockSize Neighborhood size (see the details on cornerEigenValsAndVecs ).
@param ksize Aperture parameter for the Sobel operator.
@param k Harris detector free parameter. See the formula below.
@param borderType Pixel extrapolation method. See cv::BorderTypes.
 */
@Namespace("cv") public static native void cornerHarris( @ByVal Mat src, @ByVal Mat dst, int blockSize,
                                int ksize, double k,
                                int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void cornerHarris( @ByVal Mat src, @ByVal Mat dst, int blockSize,
                                int ksize, double k );

/** \brief Calculates eigenvalues and eigenvectors of image blocks for corner detection.
<p>
For every pixel \f$p\f$ , the function cornerEigenValsAndVecs considers a blockSize \f$\times\f$ blockSize
neighborhood \f$S(p)\f$ . It calculates the covariation matrix of derivatives over the neighborhood as:
<p>
\f[M =  \begin{bmatrix} \sum _{S(p)}(dI/dx)^2 &  \sum _{S(p)}dI/dx dI/dy  \\ \sum _{S(p)}dI/dx dI/dy &  \sum _{S(p)}(dI/dy)^2 \end{bmatrix}\f]
<p>
where the derivatives are computed using the Sobel operator.
<p>
After that, it finds eigenvectors and eigenvalues of \f$M\f$ and stores them in the destination image as
\f$(\lambda_1, \lambda_2, x_1, y_1, x_2, y_2)\f$ where
<p>
-   \f$\lambda_1, \lambda_2\f$ are the non-sorted eigenvalues of \f$M\f$
-   \f$x_1, y_1\f$ are the eigenvectors corresponding to \f$\lambda_1\f$
-   \f$x_2, y_2\f$ are the eigenvectors corresponding to \f$\lambda_2\f$
<p>
The output of the function can be used for robust edge or corner detection.
<p>
@param src Input single-channel 8-bit or floating-point image.
@param dst Image to store the results. It has the same size as src and the type CV_32FC(6) .
@param blockSize Neighborhood size (see details below).
@param ksize Aperture parameter for the Sobel operator.
@param borderType Pixel extrapolation method. See cv::BorderTypes.
<p>
\sa  cornerMinEigenVal, cornerHarris, preCornerDetect
 */
@Namespace("cv") public static native void cornerEigenValsAndVecs( @ByVal Mat src, @ByVal Mat dst,
                                          int blockSize, int ksize,
                                          int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void cornerEigenValsAndVecs( @ByVal Mat src, @ByVal Mat dst,
                                          int blockSize, int ksize );

/** \brief Calculates a feature map for corner detection.
<p>
The function calculates the complex spatial derivative-based function of the source image
<p>
\f[\texttt{dst} = (D_x  \texttt{src} )^2  \cdot D_{yy}  \texttt{src} + (D_y  \texttt{src} )^2  \cdot D_{xx}  \texttt{src} - 2 D_x  \texttt{src} \cdot D_y  \texttt{src} \cdot D_{xy}  \texttt{src}\f]
<p>
where \f$D_x\f$,\f$D_y\f$ are the first image derivatives, \f$D_{xx}\f$,\f$D_{yy}\f$ are the second image
derivatives, and \f$D_{xy}\f$ is the mixed derivative.
<p>
The corners can be found as local maximums of the functions, as shown below:
<pre>{@code
    Mat corners, dilated_corners;
    preCornerDetect(image, corners, 3);
    // dilation with 3x3 rectangular structuring element
    dilate(corners, dilated_corners, Mat(), 1);
    Mat corner_mask = corners == dilated_corners;
}</pre>
<p>
@param src Source single-channel 8-bit of floating-point image.
@param dst Output image that has the type CV_32F and the same size as src .
@param ksize %Aperture size of the Sobel .
@param borderType Pixel extrapolation method. See cv::BorderTypes.
 */
@Namespace("cv") public static native void preCornerDetect( @ByVal Mat src, @ByVal Mat dst, int ksize,
                                   int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void preCornerDetect( @ByVal Mat src, @ByVal Mat dst, int ksize );

/** \brief Refines the corner locations.
<p>
The function iterates to find the sub-pixel accurate location of corners or radial saddle points, as
shown on the figure below.
<p>
![image](pics/cornersubpix.png)
<p>
Sub-pixel accurate corner locator is based on the observation that every vector from the center \f$q\f$
to a point \f$p\f$ located within a neighborhood of \f$q\f$ is orthogonal to the image gradient at \f$p\f$
subject to image and measurement noise. Consider the expression:
<p>
\f[\epsilon _i = {DI_{p_i}}^T  \cdot (q - p_i)\f]
<p>
where \f${DI_{p_i}}\f$ is an image gradient at one of the points \f$p_i\f$ in a neighborhood of \f$q\f$ . The
value of \f$q\f$ is to be found so that \f$\epsilon_i\f$ is minimized. A system of equations may be set up
with \f$\epsilon_i\f$ set to zero:
<p>
\f[\sum _i(DI_{p_i}  \cdot {DI_{p_i}}^T) -  \sum _i(DI_{p_i}  \cdot {DI_{p_i}}^T  \cdot p_i)\f]
<p>
where the gradients are summed within a neighborhood ("search window") of \f$q\f$ . Calling the first
gradient term \f$G\f$ and the second gradient term \f$b\f$ gives:
<p>
\f[q = G^{-1}  \cdot b\f]
<p>
The algorithm sets the center of the neighborhood window at this new center \f$q\f$ and then iterates
until the center stays within a set threshold.
<p>
@param image Input image.
@param corners Initial coordinates of the input corners and refined coordinates provided for
output.
@param winSize Half of the side length of the search window. For example, if winSize=Size(5,5) ,
then a \f$5*2+1 \times 5*2+1 = 11 \times 11\f$ search window is used.
@param zeroZone Half of the size of the dead region in the middle of the search zone over which
the summation in the formula below is not done. It is used sometimes to avoid possible
singularities of the autocorrelation matrix. The value of (-1,-1) indicates that there is no such
a size.
@param criteria Criteria for termination of the iterative process of corner refinement. That is,
the process of corner position refinement stops either after criteria.maxCount iterations or when
the corner position moves by less than criteria.epsilon on some iteration.
 */
@Namespace("cv") public static native void cornerSubPix( @ByVal Mat image, @ByVal Mat corners,
                                @ByVal Size winSize, @ByVal Size zeroZone,
                                @ByVal TermCriteria criteria );

/** \brief Determines strong corners on an image.
<p>
The function finds the most prominent corners in the image or in the specified image region, as
described in \cite Shi94
<p>
-   Function calculates the corner quality measure at every source image pixel using the
    cornerMinEigenVal or cornerHarris .
-   Function performs a non-maximum suppression (the local maximums in *3 x 3* neighborhood are
    retained).
-   The corners with the minimal eigenvalue less than
    \f$\texttt{qualityLevel} \cdot \max_{x,y} qualityMeasureMap(x,y)\f$ are rejected.
-   The remaining corners are sorted by the quality measure in the descending order.
-   Function throws away each corner for which there is a stronger corner at a distance less than
    maxDistance.
<p>
The function can be used to initialize a point-based tracker of an object.
<p>
\note If the function is called with different values A and B of the parameter qualityLevel , and
A \> B, the vector of returned corners with qualityLevel=A will be the prefix of the output vector
with qualityLevel=B .
<p>
@param image Input 8-bit or floating-point 32-bit, single-channel image.
@param corners Output vector of detected corners.
@param maxCorners Maximum number of corners to return. If there are more corners than are found,
the strongest of them is returned.
@param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
(see cornerMinEigenVal ) or the Harris function response (see cornerHarris ). The corners with the
quality measure less than the product are rejected. For example, if the best corner has the
quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
less than 15 are rejected.
@param minDistance Minimum possible Euclidean distance between the returned corners.
@param mask Optional region of interest. If the image is not empty (it needs to have the type
CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
@param blockSize Size of an average block for computing a derivative covariation matrix over each
pixel neighborhood. See cornerEigenValsAndVecs .
@param useHarrisDetector Parameter indicating whether to use a Harris detector (see cornerHarris)
or cornerMinEigenVal.
@param k Free parameter of the Harris detector.
<p>
\sa  cornerMinEigenVal, cornerHarris, calcOpticalFlowPyrLK, estimateRigidTransform,
 */
@Namespace("cv") public static native void goodFeaturesToTrack( @ByVal Mat image, @ByVal Mat corners,
                                     int maxCorners, double qualityLevel, double minDistance,
                                     @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/, int blockSize/*=3*/,
                                     @Cast("bool") boolean useHarrisDetector/*=false*/, double k/*=0.04*/ );
@Namespace("cv") public static native void goodFeaturesToTrack( @ByVal Mat image, @ByVal Mat corners,
                                     int maxCorners, double qualityLevel, double minDistance );

/** \example houghlines.cpp
An example using the Hough line detector
*/

/** \brief Finds lines in a binary image using the standard Hough transform.
<p>
The function implements the standard or standard multi-scale Hough transform algorithm for line
detection. See <http://homepages.inf.ed.ac.uk/rbf/HIPR2/hough.htm> for a good explanation of Hough
transform.
<p>
@param image 8-bit, single-channel binary source image. The image may be modified by the function.
@param lines Output vector of lines. Each line is represented by a two-element vector
\f$(\rho, \theta)\f$ . \f$\rho\f$ is the distance from the coordinate origin \f$(0,0)\f$ (top-left corner of
the image). \f$\theta\f$ is the line rotation angle in radians (
\f$0 \sim \textrm{vertical line}, \pi/2 \sim \textrm{horizontal line}\f$ ).
@param rho Distance resolution of the accumulator in pixels.
@param theta Angle resolution of the accumulator in radians.
@param threshold Accumulator threshold parameter. Only those lines are returned that get enough
votes ( \f$>\texttt{threshold}\f$ ).
@param srn For the multi-scale Hough transform, it is a divisor for the distance resolution rho .
The coarse accumulator distance resolution is rho and the accurate accumulator resolution is
rho/srn . If both srn=0 and stn=0 , the classical Hough transform is used. Otherwise, both these
parameters should be positive.
@param stn For the multi-scale Hough transform, it is a divisor for the distance resolution theta.
@param min_theta For standard and multi-scale Hough transform, minimum angle to check for lines.
Must fall between 0 and max_theta.
@param max_theta For standard and multi-scale Hough transform, maximum angle to check for lines.
Must fall between min_theta and CV_PI.
 */
@Namespace("cv") public static native void HoughLines( @ByVal Mat image, @ByVal Mat lines,
                              double rho, double theta, int threshold,
                              double srn/*=0*/, double stn/*=0*/,
                              double min_theta/*=0*/, double max_theta/*=CV_PI*/ );
@Namespace("cv") public static native void HoughLines( @ByVal Mat image, @ByVal Mat lines,
                              double rho, double theta, int threshold );

/** \brief Finds line segments in a binary image using the probabilistic Hough transform.
<p>
The function implements the probabilistic Hough transform algorithm for line detection, described
in \cite Matas00
<p>
See the line detection example below:
<p>
<pre>{@code
    #include <opencv2/imgproc.hpp>
    #include <opencv2/highgui.hpp>

    using namespace cv;
    using namespace std;

    int main(int argc, char** argv)
    {
        Mat src, dst, color_dst;
        if( argc != 2 || !(src=imread(argv[1], 0)).data)
            return -1;

        Canny( src, dst, 50, 200, 3 );
        cvtColor( dst, color_dst, COLOR_GRAY2BGR );

    #if 0
        vector<Vec2f> lines;
        HoughLines( dst, lines, 1, CV_PI/180, 100 );

        for( size_t i = 0; i < lines.size(); i++ )
        {
            float rho = lines[i][0];
            float theta = lines[i][1];
            double a = cos(theta), b = sin(theta);
            double x0 = a*rho, y0 = b*rho;
            Point pt1(cvRound(x0 + 1000*(-b)),
                      cvRound(y0 + 1000*(a)));
            Point pt2(cvRound(x0 - 1000*(-b)),
                      cvRound(y0 - 1000*(a)));
            line( color_dst, pt1, pt2, Scalar(0,0,255), 3, 8 );
        }
    #else
        vector<Vec4i> lines;
        HoughLinesP( dst, lines, 1, CV_PI/180, 80, 30, 10 );
        for( size_t i = 0; i < lines.size(); i++ )
        {
            line( color_dst, Point(lines[i][0], lines[i][1]),
                Point(lines[i][2], lines[i][3]), Scalar(0,0,255), 3, 8 );
        }
    #endif
        namedWindow( "Source", 1 );
        imshow( "Source", src );

        namedWindow( "Detected Lines", 1 );
        imshow( "Detected Lines", color_dst );

        waitKey(0);
        return 0;
    }
}</pre>
This is a sample picture the function parameters have been tuned for:
<p>
![image](pics/building.jpg)
<p>
And this is the output of the above program in case of the probabilistic Hough transform:
<p>
![image](pics/houghp.png)
<p>
@param image 8-bit, single-channel binary source image. The image may be modified by the function.
@param lines Output vector of lines. Each line is represented by a 4-element vector
\f$(x_1, y_1, x_2, y_2)\f$ , where \f$(x_1,y_1)\f$ and \f$(x_2, y_2)\f$ are the ending points of each detected
line segment.
@param rho Distance resolution of the accumulator in pixels.
@param theta Angle resolution of the accumulator in radians.
@param threshold Accumulator threshold parameter. Only those lines are returned that get enough
votes ( \f$>\texttt{threshold}\f$ ).
@param minLineLength Minimum line length. Line segments shorter than that are rejected.
@param maxLineGap Maximum allowed gap between points on the same line to link them.
<p>
\sa LineSegmentDetector
 */
@Namespace("cv") public static native void HoughLinesP( @ByVal Mat image, @ByVal Mat lines,
                               double rho, double theta, int threshold,
                               double minLineLength/*=0*/, double maxLineGap/*=0*/ );
@Namespace("cv") public static native void HoughLinesP( @ByVal Mat image, @ByVal Mat lines,
                               double rho, double theta, int threshold );

/** \example houghcircles.cpp
An example using the Hough circle detector
*/

/** \brief Finds circles in a grayscale image using the Hough transform.
<p>
The function finds circles in a grayscale image using a modification of the Hough transform.
<p>
Example: :
<pre>{@code
    #include <opencv2/imgproc.hpp>
    #include <opencv2/highgui.hpp>
    #include <math.h>

    using namespace cv;
    using namespace std;

    int main(int argc, char** argv)
    {
        Mat img, gray;
        if( argc != 2 || !(img=imread(argv[1], 1)).data)
            return -1;
        cvtColor(img, gray, COLOR_BGR2GRAY);
        // smooth it, otherwise a lot of false circles may be detected
        GaussianBlur( gray, gray, Size(9, 9), 2, 2 );
        vector<Vec3f> circles;
        HoughCircles(gray, circles, HOUGH_GRADIENT,
                     2, gray.rows/4, 200, 100 );
        for( size_t i = 0; i < circles.size(); i++ )
        {
             Point center(cvRound(circles[i][0]), cvRound(circles[i][1]));
             int radius = cvRound(circles[i][2]);
             // draw the circle center
             circle( img, center, 3, Scalar(0,255,0), -1, 8, 0 );
             // draw the circle outline
             circle( img, center, radius, Scalar(0,0,255), 3, 8, 0 );
        }
        namedWindow( "circles", 1 );
        imshow( "circles", img );

        waitKey(0);
        return 0;
    }
}</pre>
<p>
\note Usually the function detects the centers of circles well. However, it may fail to find correct
radii. You can assist to the function by specifying the radius range ( minRadius and maxRadius ) if
you know it. Or, you may ignore the returned radius, use only the center, and find the correct
radius using an additional procedure.
<p>
@param image 8-bit, single-channel, grayscale input image.
@param circles Output vector of found circles. Each vector is encoded as a 3-element
floating-point vector \f$(x, y, radius)\f$ .
@param method Detection method, see cv::HoughModes. Currently, the only implemented method is HOUGH_GRADIENT
@param dp Inverse ratio of the accumulator resolution to the image resolution. For example, if
dp=1 , the accumulator has the same resolution as the input image. If dp=2 , the accumulator has
half as big width and height.
@param minDist Minimum distance between the centers of the detected circles. If the parameter is
too small, multiple neighbor circles may be falsely detected in addition to a true one. If it is
too large, some circles may be missed.
@param param1 First method-specific parameter. In case of CV_HOUGH_GRADIENT , it is the higher
threshold of the two passed to the Canny edge detector (the lower one is twice smaller).
@param param2 Second method-specific parameter. In case of CV_HOUGH_GRADIENT , it is the
accumulator threshold for the circle centers at the detection stage. The smaller it is, the more
false circles may be detected. Circles, corresponding to the larger accumulator values, will be
returned first.
@param minRadius Minimum circle radius.
@param maxRadius Maximum circle radius.
<p>
\sa fitEllipse, minEnclosingCircle
 */
@Namespace("cv") public static native void HoughCircles( @ByVal Mat image, @ByVal Mat circles,
                               int method, double dp, double minDist,
                               double param1/*=100*/, double param2/*=100*/,
                               int minRadius/*=0*/, int maxRadius/*=0*/ );
@Namespace("cv") public static native void HoughCircles( @ByVal Mat image, @ByVal Mat circles,
                               int method, double dp, double minDist );

/** \} imgproc_feature
 <p>
 *  \addtogroup imgproc_filter
 *  \{
<p>
/** \example morphology2.cpp
  An example using the morphological operations
*/

/** \brief Erodes an image by using a specific structuring element.
<p>
The function erodes the source image using the specified structuring element that determines the
shape of a pixel neighborhood over which the minimum is taken:
<p>
\f[\texttt{dst} (x,y) =  \min _{(x',y'):  \, \texttt{element} (x',y') \ne0 } \texttt{src} (x+x',y+y')\f]
<p>
The function supports the in-place mode. Erosion can be applied several ( iterations ) times. In
case of multi-channel images, each channel is processed independently.
<p>
@param src input image; the number of channels can be arbitrary, but the depth should be one of
CV_8U, CV_16U, CV_16S, CV_32F or CV_64F.
@param dst output image of the same size and type as src.
@param kernel structuring element used for erosion; if {@code element=Mat()}, a {@code 3 x 3} rectangular
structuring element is used. Kernel can be created using getStructuringElement.
@param anchor position of the anchor within the element; default value (-1, -1) means that the
anchor is at the element center.
@param iterations number of times erosion is applied.
@param borderType pixel extrapolation method, see cv::BorderTypes
@param borderValue border value in case of a constant border
\sa  dilate, morphologyEx, getStructuringElement
 */
@Namespace("cv") public static native void erode( @ByVal Mat src, @ByVal Mat dst, @ByVal Mat kernel,
                         @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor/*=cv::Point(-1,-1)*/, int iterations/*=1*/,
                         int borderType/*=cv::BORDER_CONSTANT*/,
                         @Const @ByRef(nullValue = "cv::morphologyDefaultBorderValue()") Scalar borderValue/*=cv::morphologyDefaultBorderValue()*/ );
@Namespace("cv") public static native void erode( @ByVal Mat src, @ByVal Mat dst, @ByVal Mat kernel );

/** \brief Dilates an image by using a specific structuring element.
<p>
The function dilates the source image using the specified structuring element that determines the
shape of a pixel neighborhood over which the maximum is taken:
\f[\texttt{dst} (x,y) =  \max _{(x',y'):  \, \texttt{element} (x',y') \ne0 } \texttt{src} (x+x',y+y')\f]
<p>
The function supports the in-place mode. Dilation can be applied several ( iterations ) times. In
case of multi-channel images, each channel is processed independently.
<p>
@param src input image; the number of channels can be arbitrary, but the depth should be one of
CV_8U, CV_16U, CV_16S, CV_32F or CV_64F.
@param dst output image of the same size and type as src\{@code .
@param kernel structuring element used for dilation; if elemenat=Mat(), a 3 x 3 rectangular
structuring element is used. Kernel can be created using getStructuringElement
@param anchor position of the anchor within the element; default value (-1, -1) means that the
anchor is at the element center.
@param iterations number of times dilation is applied.
@param borderType pixel extrapolation method, see cv::BorderTypes
@param borderValue border value in case of a constant border
@sa  erode, morphologyEx, getStructuringElement
 */
@Namespace("cv") public static native void dilate( @ByVal Mat src, @ByVal Mat dst, @ByVal Mat kernel,
                          @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor/*=cv::Point(-1,-1)*/, int iterations/*=1*/,
                          int borderType/*=cv::BORDER_CONSTANT*/,
                          @Const @ByRef(nullValue = "cv::morphologyDefaultBorderValue()") Scalar borderValue/*=cv::morphologyDefaultBorderValue()*/ );
@Namespace("cv") public static native void dilate( @ByVal Mat src, @ByVal Mat dst, @ByVal Mat kernel );

/** \brief Performs advanced morphological transformations.
<p>
The function morphologyEx can perform advanced morphological transformations using an erosion and dilation as
basic operations.
<p>
Any of the operations can be done in-place. In case of multi-channel images, each channel is
processed independently.
<p>
@param src Source image. The number of channels can be arbitrary. The depth should be one of
CV_8U, CV_16U, CV_16S, CV_32F or CV_64F.
@param dst Destination image of the same size and type as source image.
@param op Type of a morphological operation, see cv::MorphTypes
@param kernel Structuring element. It can be created using cv::getStructuringElement.
@param anchor Anchor position with the kernel. Negative values mean that the anchor is at the
kernel center.
@param iterations Number of times erosion and dilation are applied.
@param borderType Pixel extrapolation method, see cv::BorderTypes
@param borderValue Border value in case of a constant border. The default value has a special
meaning.
\sa  dilate, erode, getStructuringElement
 */
@Namespace("cv") public static native void morphologyEx( @ByVal Mat src, @ByVal Mat dst,
                                int op, @ByVal Mat kernel,
                                @ByVal(nullValue = "cv::Point(-1,-1)") Point anchor/*=cv::Point(-1,-1)*/, int iterations/*=1*/,
                                int borderType/*=cv::BORDER_CONSTANT*/,
                                @Const @ByRef(nullValue = "cv::morphologyDefaultBorderValue()") Scalar borderValue/*=cv::morphologyDefaultBorderValue()*/ );
@Namespace("cv") public static native void morphologyEx( @ByVal Mat src, @ByVal Mat dst,
                                int op, @ByVal Mat kernel );

/** \} imgproc_filter
 <p>
 *  \addtogroup imgproc_transform
 *  \{
<p>
/** \brief Resizes an image.
<p>
The function resize resizes the image src down to or up to the specified size. Note that the
initial dst type or size are not taken into account. Instead, the size and type are derived from
the {@code src},{@code dsize},{@code fx}, and {@code fy}. If you want to resize src so that it fits the pre-created dst,
you may call the function as follows:
<pre>{@code
    // explicitly specify dsize=dst.size(); fx and fy will be computed from that.
    resize(src, dst, dst.size(), 0, 0, interpolation);
}</pre>
If you want to decimate the image by factor of 2 in each direction, you can call the function this
way:
<pre>{@code
    // specify fx and fy and let the function compute the destination image size.
    resize(src, dst, Size(), 0.5, 0.5, interpolation);
}</pre>
To shrink an image, it will generally look best with cv::INTER_AREA interpolation, whereas to
enlarge an image, it will generally look best with cv::INTER_CUBIC (slow) or cv::INTER_LINEAR
(faster but still looks OK).
<p>
@param src input image.
@param dst output image; it has the size dsize (when it is non-zero) or the size computed from
src.size(), fx, and fy; the type of dst is the same as of src.
@param dsize output image size; if it equals zero, it is computed as:
 \f[\texttt{dsize = Size(round(fx*src.cols), round(fy*src.rows))}\f]
 Either dsize or both fx and fy must be non-zero.
@param fx scale factor along the horizontal axis; when it equals 0, it is computed as
\f[\texttt{(double)dsize.width/src.cols}\f]
@param fy scale factor along the vertical axis; when it equals 0, it is computed as
\f[\texttt{(double)dsize.height/src.rows}\f]
@param interpolation interpolation method, see cv::InterpolationFlags
<p>
\sa  warpAffine, warpPerspective, remap
 */
@Namespace("cv") public static native void resize( @ByVal Mat src, @ByVal Mat dst,
                          @ByVal Size dsize, double fx/*=0*/, double fy/*=0*/,
                          int interpolation/*=cv::INTER_LINEAR*/ );
@Namespace("cv") public static native void resize( @ByVal Mat src, @ByVal Mat dst,
                          @ByVal Size dsize );

/** \brief Applies an affine transformation to an image.
<p>
The function warpAffine transforms the source image using the specified matrix:
<p>
\f[\texttt{dst} (x,y) =  \texttt{src} ( \texttt{M} _{11} x +  \texttt{M} _{12} y +  \texttt{M} _{13}, \texttt{M} _{21} x +  \texttt{M} _{22} y +  \texttt{M} _{23})\f]
<p>
when the flag WARP_INVERSE_MAP is set. Otherwise, the transformation is first inverted
with cv::invertAffineTransform and then put in the formula above instead of M. The function cannot
operate in-place.
<p>
@param src input image.
@param dst output image that has the size dsize and the same type as src .
@param M \f$2\times 3\f$ transformation matrix.
@param dsize size of the output image.
@param flags combination of interpolation methods (see cv::InterpolationFlags) and the optional
flag WARP_INVERSE_MAP that means that M is the inverse transformation (
\f$\texttt{dst}\rightarrow\texttt{src}\f$ ).
@param borderMode pixel extrapolation method (see cv::BorderTypes); when
borderMode=BORDER_TRANSPARENT, it means that the pixels in the destination image corresponding to
the "outliers" in the source image are not modified by the function.
@param borderValue value used in case of a constant border; by default, it is 0.
<p>
\sa  warpPerspective, resize, remap, getRectSubPix, transform
 */
@Namespace("cv") public static native void warpAffine( @ByVal Mat src, @ByVal Mat dst,
                              @ByVal Mat M, @ByVal Size dsize,
                              int flags/*=cv::INTER_LINEAR*/,
                              int borderMode/*=cv::BORDER_CONSTANT*/,
                              @Const @ByRef(nullValue = "cv::Scalar()") Scalar borderValue/*=cv::Scalar()*/);
@Namespace("cv") public static native void warpAffine( @ByVal Mat src, @ByVal Mat dst,
                              @ByVal Mat M, @ByVal Size dsize);

/** \brief Applies a perspective transformation to an image.
<p>
The function warpPerspective transforms the source image using the specified matrix:
<p>
\f[\texttt{dst} (x,y) =  \texttt{src} \left ( \frac{M_{11} x + M_{12} y + M_{13}}{M_{31} x + M_{32} y + M_{33}} ,
     \frac{M_{21} x + M_{22} y + M_{23}}{M_{31} x + M_{32} y + M_{33}} \right )\f]
<p>
when the flag WARP_INVERSE_MAP is set. Otherwise, the transformation is first inverted with invert
and then put in the formula above instead of M. The function cannot operate in-place.
<p>
@param src input image.
@param dst output image that has the size dsize and the same type as src .
@param M \f$3\times 3\f$ transformation matrix.
@param dsize size of the output image.
@param flags combination of interpolation methods (INTER_LINEAR or INTER_NEAREST) and the
optional flag WARP_INVERSE_MAP, that sets M as the inverse transformation (
\f$\texttt{dst}\rightarrow\texttt{src}\f$ ).
@param borderMode pixel extrapolation method (BORDER_CONSTANT or BORDER_REPLICATE).
@param borderValue value used in case of a constant border; by default, it equals 0.
<p>
\sa  warpAffine, resize, remap, getRectSubPix, perspectiveTransform
 */
@Namespace("cv") public static native void warpPerspective( @ByVal Mat src, @ByVal Mat dst,
                                   @ByVal Mat M, @ByVal Size dsize,
                                   int flags/*=cv::INTER_LINEAR*/,
                                   int borderMode/*=cv::BORDER_CONSTANT*/,
                                   @Const @ByRef(nullValue = "cv::Scalar()") Scalar borderValue/*=cv::Scalar()*/);
@Namespace("cv") public static native void warpPerspective( @ByVal Mat src, @ByVal Mat dst,
                                   @ByVal Mat M, @ByVal Size dsize);

/** \brief Applies a generic geometrical transformation to an image.
<p>
The function remap transforms the source image using the specified map:
<p>
\f[\texttt{dst} (x,y) =  \texttt{src} (map_x(x,y),map_y(x,y))\f]
<p>
where values of pixels with non-integer coordinates are computed using one of available
interpolation methods. \f$map_x\f$ and \f$map_y\f$ can be encoded as separate floating-point maps
in \f$map_1\f$ and \f$map_2\f$ respectively, or interleaved floating-point maps of \f$(x,y)\f$ in
\f$map_1\f$, or fixed-point maps created by using convertMaps. The reason you might want to
convert from floating to fixed-point representations of a map is that they can yield much faster
(\~2x) remapping operations. In the converted case, \f$map_1\f$ contains pairs (cvFloor(x),
cvFloor(y)) and \f$map_2\f$ contains indices in a table of interpolation coefficients.
<p>
This function cannot operate in-place.
<p>
@param src Source image.
@param dst Destination image. It has the same size as map1 and the same type as src .
@param map1 The first map of either (x,y) points or just x values having the type CV_16SC2 ,
CV_32FC1, or CV_32FC2. See convertMaps for details on converting a floating point
representation to fixed-point for speed.
@param map2 The second map of y values having the type CV_16UC1, CV_32FC1, or none (empty map
if map1 is (x,y) points), respectively.
@param interpolation Interpolation method (see cv::InterpolationFlags). The method INTER_AREA is
not supported by this function.
@param borderMode Pixel extrapolation method (see cv::BorderTypes). When
borderMode=BORDER_TRANSPARENT, it means that the pixels in the destination image that
corresponds to the "outliers" in the source image are not modified by the function.
@param borderValue Value used in case of a constant border. By default, it is 0.
 */
@Namespace("cv") public static native void remap( @ByVal Mat src, @ByVal Mat dst,
                         @ByVal Mat map1, @ByVal Mat map2,
                         int interpolation, int borderMode/*=cv::BORDER_CONSTANT*/,
                         @Const @ByRef(nullValue = "cv::Scalar()") Scalar borderValue/*=cv::Scalar()*/);
@Namespace("cv") public static native void remap( @ByVal Mat src, @ByVal Mat dst,
                         @ByVal Mat map1, @ByVal Mat map2,
                         int interpolation);

/** \brief Converts image transformation maps from one representation to another.
<p>
The function converts a pair of maps for remap from one representation to another. The following
options ( (map1.type(), map2.type()) \f$\rightarrow\f$ (dstmap1.type(), dstmap2.type()) ) are
supported:
<p>
- \f$\texttt{(CV\_32FC1, CV\_32FC1)} \rightarrow \texttt{(CV\_16SC2, CV\_16UC1)}\f$. This is the
most frequently used conversion operation, in which the original floating-point maps (see remap )
are converted to a more compact and much faster fixed-point representation. The first output array
contains the rounded coordinates and the second array (created only when nninterpolation=false )
contains indices in the interpolation tables.
<p>
- \f$\texttt{(CV\_32FC2)} \rightarrow \texttt{(CV\_16SC2, CV\_16UC1)}\f$. The same as above but
the original maps are stored in one 2-channel matrix.
<p>
- Reverse conversion. Obviously, the reconstructed floating-point maps will not be exactly the same
as the originals.
<p>
@param map1 The first input map of type CV_16SC2, CV_32FC1, or CV_32FC2 .
@param map2 The second input map of type CV_16UC1, CV_32FC1, or none (empty matrix),
respectively.
@param dstmap1 The first output map that has the type dstmap1type and the same size as src .
@param dstmap2 The second output map.
@param dstmap1type Type of the first output map that should be CV_16SC2, CV_32FC1, or
CV_32FC2 .
@param nninterpolation Flag indicating whether the fixed-point maps are used for the
nearest-neighbor or for a more complex interpolation.
<p>
\sa  remap, undistort, initUndistortRectifyMap
 */
@Namespace("cv") public static native void convertMaps( @ByVal Mat map1, @ByVal Mat map2,
                               @ByVal Mat dstmap1, @ByVal Mat dstmap2,
                               int dstmap1type, @Cast("bool") boolean nninterpolation/*=false*/ );
@Namespace("cv") public static native void convertMaps( @ByVal Mat map1, @ByVal Mat map2,
                               @ByVal Mat dstmap1, @ByVal Mat dstmap2,
                               int dstmap1type );

/** \brief Calculates an affine matrix of 2D rotation.
<p>
The function calculates the following matrix:
<p>
\f[\begin{bmatrix} \alpha &  \beta & (1- \alpha )  \cdot \texttt{center.x} -  \beta \cdot \texttt{center.y} \\ - \beta &  \alpha &  \beta \cdot \texttt{center.x} + (1- \alpha )  \cdot \texttt{center.y} \end{bmatrix}\f]
<p>
where
<p>
\f[\begin{array}{l} \alpha =  \texttt{scale} \cdot \cos \texttt{angle} , \\ \beta =  \texttt{scale} \cdot \sin \texttt{angle} \end{array}\f]
<p>
The transformation maps the rotation center to itself. If this is not the target, adjust the shift.
<p>
@param center Center of the rotation in the source image.
@param angle Rotation angle in degrees. Positive values mean counter-clockwise rotation (the
coordinate origin is assumed to be the top-left corner).
@param scale Isotropic scale factor.
<p>
\sa  getAffineTransform, warpAffine, transform
 */
@Namespace("cv") public static native @ByVal Mat getRotationMatrix2D( @ByVal Point2f center, double angle, double scale );

/** returns 3x3 perspective transformation for the corresponding 4 point pairs. */
@Namespace("cv") public static native @ByVal Mat getPerspectiveTransform( @Const Point2f src, @Const Point2f dst );

/** \brief Calculates an affine transform from three pairs of the corresponding points.
<p>
The function calculates the \f$2 \times 3\f$ matrix of an affine transform so that:
<p>
\f[\begin{bmatrix} x'_i \\ y'_i \end{bmatrix} = \texttt{map\_matrix} \cdot \begin{bmatrix} x_i \\ y_i \\ 1 \end{bmatrix}\f]
<p>
where
<p>
\f[dst(i)=(x'_i,y'_i), src(i)=(x_i, y_i), i=0,1,2\f]
<p>
@param src Coordinates of triangle vertices in the source image.
@param dst Coordinates of the corresponding triangle vertices in the destination image.
<p>
\sa  warpAffine, transform
 */
@Namespace("cv") public static native @ByVal Mat getAffineTransform( @Const Point2f src, @Const Point2f dst );

/** \brief Inverts an affine transformation.
<p>
The function computes an inverse affine transformation represented by \f$2 \times 3\f$ matrix M:
<p>
\f[\begin{bmatrix} a_{11} & a_{12} & b_1  \\ a_{21} & a_{22} & b_2 \end{bmatrix}\f]
<p>
The result is also a \f$2 \times 3\f$ matrix of the same type as M.
<p>
@param M Original affine transformation.
@param iM Output reverse affine transformation.
 */
@Namespace("cv") public static native void invertAffineTransform( @ByVal Mat M, @ByVal Mat iM );

/** \brief Calculates a perspective transform from four pairs of the corresponding points.
<p>
The function calculates the \f$3 \times 3\f$ matrix of a perspective transform so that:
<p>
\f[\begin{bmatrix} t_i x'_i \\ t_i y'_i \\ t_i \end{bmatrix} = \texttt{map\_matrix} \cdot \begin{bmatrix} x_i \\ y_i \\ 1 \end{bmatrix}\f]
<p>
where
<p>
\f[dst(i)=(x'_i,y'_i), src(i)=(x_i, y_i), i=0,1,2,3\f]
<p>
@param src Coordinates of quadrangle vertices in the source image.
@param dst Coordinates of the corresponding quadrangle vertices in the destination image.
<p>
\sa  findHomography, warpPerspective, perspectiveTransform
 */
@Namespace("cv") public static native @ByVal Mat getPerspectiveTransform( @ByVal Mat src, @ByVal Mat dst );

@Namespace("cv") public static native @ByVal Mat getAffineTransform( @ByVal Mat src, @ByVal Mat dst );

/** \brief Retrieves a pixel rectangle from an image with sub-pixel accuracy.
<p>
The function getRectSubPix extracts pixels from src:
<p>
\f[dst(x, y) = src(x +  \texttt{center.x} - ( \texttt{dst.cols} -1)*0.5, y +  \texttt{center.y} - ( \texttt{dst.rows} -1)*0.5)\f]
<p>
where the values of the pixels at non-integer coordinates are retrieved using bilinear
interpolation. Every channel of multi-channel images is processed independently. While the center of
the rectangle must be inside the image, parts of the rectangle may be outside. In this case, the
replication border mode (see cv::BorderTypes) is used to extrapolate the pixel values outside of
the image.
<p>
@param image Source image.
@param patchSize Size of the extracted patch.
@param center Floating point coordinates of the center of the extracted rectangle within the
source image. The center must be inside the image.
@param patch Extracted patch that has the size patchSize and the same number of channels as src .
@param patchType Depth of the extracted pixels. By default, they have the same depth as src .
<p>
\sa  warpAffine, warpPerspective
 */
@Namespace("cv") public static native void getRectSubPix( @ByVal Mat image, @ByVal Size patchSize,
                                 @ByVal Point2f center, @ByVal Mat patch, int patchType/*=-1*/ );
@Namespace("cv") public static native void getRectSubPix( @ByVal Mat image, @ByVal Size patchSize,
                                 @ByVal Point2f center, @ByVal Mat patch );

/** \example polar_transforms.cpp
An example using the cv::linearPolar and cv::logPolar operations
*/

/** \brief Remaps an image to log-polar space.
<p>
transforms the source image using the following transformation:
\f[dst( \phi , \rho ) = src(x,y)\f]
where
\f[\rho = M  \cdot \log{\sqrt{x^2 + y^2}} , \phi =atan(y/x)\f]
<p>
The function emulates the human "foveal" vision and can be used for fast scale and
rotation-invariant template matching, for object tracking and so forth. The function can not operate
in-place.
<p>
@param src Source image
@param dst Destination image
@param center The transformation center; where the output precision is maximal
@param M Magnitude scale parameter.
@param flags A combination of interpolation methods, see cv::InterpolationFlags
 */
@Namespace("cv") public static native void logPolar( @ByVal Mat src, @ByVal Mat dst,
                            @ByVal Point2f center, double M, int flags );

/** \brief Remaps an image to polar space.
<p>
transforms the source image using the following transformation:
\f[dst( \phi , \rho ) = src(x,y)\f]
where
\f[\rho = (src.width/maxRadius)  \cdot \sqrt{x^2 + y^2} , \phi =atan(y/x)\f]
<p>
The function can not operate in-place.
<p>
@param src Source image
@param dst Destination image
@param center The transformation center;
@param maxRadius Inverse magnitude scale parameter
@param flags A combination of interpolation methods, see cv::InterpolationFlags
 */
@Namespace("cv") public static native void linearPolar( @ByVal Mat src, @ByVal Mat dst,
                               @ByVal Point2f center, double maxRadius, int flags );

/** \} imgproc_transform
 <p>
 *  \addtogroup imgproc_misc
 *  \{
<p>
/** \overload */
@Namespace("cv") public static native void integral( @ByVal Mat src, @ByVal Mat sum, int sdepth/*=-1*/ );
@Namespace("cv") public static native void integral( @ByVal Mat src, @ByVal Mat sum );

/** \overload */
@Namespace("cv") public static native @Name("integral") void integral2( @ByVal Mat src, @ByVal Mat sum,
                                        @ByVal Mat sqsum, int sdepth/*=-1*/, int sqdepth/*=-1*/ );
@Namespace("cv") public static native @Name("integral") void integral2( @ByVal Mat src, @ByVal Mat sum,
                                        @ByVal Mat sqsum );

/** \brief Calculates the integral of an image.
<p>
The functions calculate one or more integral images for the source image as follows:
<p>
\f[\texttt{sum} (X,Y) =  \sum _{x<X,y<Y}  \texttt{image} (x,y)\f]
<p>
\f[\texttt{sqsum} (X,Y) =  \sum _{x<X,y<Y}  \texttt{image} (x,y)^2\f]
<p>
\f[\texttt{tilted} (X,Y) =  \sum _{y<Y,abs(x-X+1) \leq Y-y-1}  \texttt{image} (x,y)\f]
<p>
Using these integral images, you can calculate sum, mean, and standard deviation over a specific
up-right or rotated rectangular region of the image in a constant time, for example:
<p>
\f[\sum _{x_1 \leq x < x_2,  \, y_1  \leq y < y_2}  \texttt{image} (x,y) =  \texttt{sum} (x_2,y_2)- \texttt{sum} (x_1,y_2)- \texttt{sum} (x_2,y_1)+ \texttt{sum} (x_1,y_1)\f]
<p>
It makes possible to do a fast blurring or fast block correlation with a variable window size, for
example. In case of multi-channel images, sums for each channel are accumulated independently.
<p>
As a practical example, the next figure shows the calculation of the integral of a straight
rectangle Rect(3,3,3,2) and of a tilted rectangle Rect(5,1,2,3) . The selected pixels in the
original image are shown, as well as the relative pixels in the integral images sum and tilted .
<p>
![integral calculation example](pics/integral.png)
<p>
@param src input image as \f$W \times H\f$, 8-bit or floating-point (32f or 64f).
@param sum integral image as \f$(W+1)\times (H+1)\f$ , 32-bit integer or floating-point (32f or 64f).
@param sqsum integral image for squared pixel values; it is \f$(W+1)\times (H+1)\f$, double-precision
floating-point (64f) array.
@param tilted integral for the image rotated by 45 degrees; it is \f$(W+1)\times (H+1)\f$ array with
the same data type as sum.
@param sdepth desired depth of the integral and the tilted integral images, CV_32S, CV_32F, or
CV_64F.
@param sqdepth desired depth of the integral image of squared pixel values, CV_32F or CV_64F.
 */
@Namespace("cv") public static native @Name("integral") void integral3( @ByVal Mat src, @ByVal Mat sum,
                                        @ByVal Mat sqsum, @ByVal Mat tilted,
                                        int sdepth/*=-1*/, int sqdepth/*=-1*/ );
@Namespace("cv") public static native @Name("integral") void integral3( @ByVal Mat src, @ByVal Mat sum,
                                        @ByVal Mat sqsum, @ByVal Mat tilted );

/** \} imgproc_misc
 <p>
 *  \addtogroup imgproc_motion
 *  \{
<p>
/** \brief Adds an image to the accumulator.
<p>
The function adds src or some of its elements to dst :
<p>
\f[\texttt{dst} (x,y)  \leftarrow \texttt{dst} (x,y) +  \texttt{src} (x,y)  \quad \text{if} \quad \texttt{mask} (x,y)  \ne 0\f]
<p>
The function supports multi-channel images. Each channel is processed independently.
<p>
The functions accumulate\* can be used, for example, to collect statistics of a scene background
viewed by a still camera and for the further foreground-background segmentation.
<p>
@param src Input image as 1- or 3-channel, 8-bit or 32-bit floating point.
@param dst %Accumulator image with the same number of channels as input image, 32-bit or 64-bit
floating-point.
@param mask Optional operation mask.
<p>
\sa  accumulateSquare, accumulateProduct, accumulateWeighted
 */
@Namespace("cv") public static native void accumulate( @ByVal Mat src, @ByVal Mat dst,
                              @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/ );
@Namespace("cv") public static native void accumulate( @ByVal Mat src, @ByVal Mat dst );

/** \brief Adds the square of a source image to the accumulator.
<p>
The function adds the input image src or its selected region, raised to a power of 2, to the
accumulator dst :
<p>
\f[\texttt{dst} (x,y)  \leftarrow \texttt{dst} (x,y) +  \texttt{src} (x,y)^2  \quad \text{if} \quad \texttt{mask} (x,y)  \ne 0\f]
<p>
The function supports multi-channel images. Each channel is processed independently.
<p>
@param src Input image as 1- or 3-channel, 8-bit or 32-bit floating point.
@param dst %Accumulator image with the same number of channels as input image, 32-bit or 64-bit
floating-point.
@param mask Optional operation mask.
<p>
\sa  accumulateSquare, accumulateProduct, accumulateWeighted
 */
@Namespace("cv") public static native void accumulateSquare( @ByVal Mat src, @ByVal Mat dst,
                                    @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/ );
@Namespace("cv") public static native void accumulateSquare( @ByVal Mat src, @ByVal Mat dst );

/** \brief Adds the per-element product of two input images to the accumulator.
<p>
The function adds the product of two images or their selected regions to the accumulator dst :
<p>
\f[\texttt{dst} (x,y)  \leftarrow \texttt{dst} (x,y) +  \texttt{src1} (x,y)  \cdot \texttt{src2} (x,y)  \quad \text{if} \quad \texttt{mask} (x,y)  \ne 0\f]
<p>
The function supports multi-channel images. Each channel is processed independently.
<p>
@param src1 First input image, 1- or 3-channel, 8-bit or 32-bit floating point.
@param src2 Second input image of the same type and the same size as src1 .
@param dst %Accumulator with the same number of channels as input images, 32-bit or 64-bit
floating-point.
@param mask Optional operation mask.
<p>
\sa  accumulate, accumulateSquare, accumulateWeighted
 */
@Namespace("cv") public static native void accumulateProduct( @ByVal Mat src1, @ByVal Mat src2,
                                     @ByVal Mat dst, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/ );
@Namespace("cv") public static native void accumulateProduct( @ByVal Mat src1, @ByVal Mat src2,
                                     @ByVal Mat dst );

/** \brief Updates a running average.
<p>
The function calculates the weighted sum of the input image src and the accumulator dst so that dst
becomes a running average of a frame sequence:
<p>
\f[\texttt{dst} (x,y)  \leftarrow (1- \texttt{alpha} )  \cdot \texttt{dst} (x,y) +  \texttt{alpha} \cdot \texttt{src} (x,y)  \quad \text{if} \quad \texttt{mask} (x,y)  \ne 0\f]
<p>
That is, alpha regulates the update speed (how fast the accumulator "forgets" about earlier images).
The function supports multi-channel images. Each channel is processed independently.
<p>
@param src Input image as 1- or 3-channel, 8-bit or 32-bit floating point.
@param dst %Accumulator image with the same number of channels as input image, 32-bit or 64-bit
floating-point.
@param alpha Weight of the input image.
@param mask Optional operation mask.
<p>
\sa  accumulate, accumulateSquare, accumulateProduct
 */
@Namespace("cv") public static native void accumulateWeighted( @ByVal Mat src, @ByVal Mat dst,
                                      double alpha, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/ );
@Namespace("cv") public static native void accumulateWeighted( @ByVal Mat src, @ByVal Mat dst,
                                      double alpha );

/** \brief The function is used to detect translational shifts that occur between two images.
<p>
The operation takes advantage of the Fourier shift theorem for detecting the translational shift in
the frequency domain. It can be used for fast image registration as well as motion estimation. For
more information please see <http://en.wikipedia.org/wiki/Phase_correlation>
<p>
Calculates the cross-power spectrum of two supplied source arrays. The arrays are padded if needed
with getOptimalDFTSize.
<p>
The function performs the following equations:
- First it applies a Hanning window (see <http://en.wikipedia.org/wiki/Hann_function>) to each
image to remove possible edge effects. This window is cached until the array size changes to speed
up processing time.
- Next it computes the forward DFTs of each source array:
\f[\mathbf{G}_a = \mathcal{F}\{src_1\}, \; \mathbf{G}_b = \mathcal{F}\{src_2\}\f]
where \f$\mathcal{F}\f$ is the forward DFT.
- It then computes the cross-power spectrum of each frequency domain array:
\f[R = \frac{ \mathbf{G}_a \mathbf{G}_b^*}{|\mathbf{G}_a \mathbf{G}_b^*|}\f]
- Next the cross-correlation is converted back into the time domain via the inverse DFT:
\f[r = \mathcal{F}^{-1}\{R\}\f]
- Finally, it computes the peak location and computes a 5x5 weighted centroid around the peak to
achieve sub-pixel accuracy.
\f[(\Delta x, \Delta y) = \texttt{weightedCentroid} \{\arg \max_{(x, y)}\{r\}\}\f]
- If non-zero, the response parameter is computed as the sum of the elements of r within the 5x5
centroid around the peak location. It is normalized to a maximum of 1 (meaning there is a single
peak) and will be smaller when there are multiple peaks.
<p>
@param src1 Source floating point array (CV_32FC1 or CV_64FC1)
@param src2 Source floating point array (CV_32FC1 or CV_64FC1)
@param window Floating point array with windowing coefficients to reduce edge effects (optional).
@param response Signal power within the 5x5 centroid around the peak, between 0 and 1 (optional).
@return detected phase shift (sub-pixel) between the two arrays.
<p>
\sa dft, getOptimalDFTSize, idft, mulSpectrums createHanningWindow
 */
@Namespace("cv") public static native @ByVal Point2d phaseCorrelate(@ByVal Mat src1, @ByVal Mat src2,
                                    @ByVal(nullValue = "cv::noArray()") Mat window/*=cv::noArray()*/, DoublePointer response/*=0*/);
@Namespace("cv") public static native @ByVal Point2d phaseCorrelate(@ByVal Mat src1, @ByVal Mat src2);
@Namespace("cv") public static native @ByVal Point2d phaseCorrelate(@ByVal Mat src1, @ByVal Mat src2,
                                    @ByVal(nullValue = "cv::noArray()") Mat window/*=cv::noArray()*/, DoubleBuffer response/*=0*/);
@Namespace("cv") public static native @ByVal Point2d phaseCorrelate(@ByVal Mat src1, @ByVal Mat src2,
                                    @ByVal(nullValue = "cv::noArray()") Mat window/*=cv::noArray()*/, double[] response/*=0*/);

/** \brief This function computes a Hanning window coefficients in two dimensions.
<p>
See (http://en.wikipedia.org/wiki/Hann_function) and (http://en.wikipedia.org/wiki/Window_function)
for more information.
<p>
An example is shown below:
<pre>{@code
    // create hanning window of size 100x100 and type CV_32F
    Mat hann;
    createHanningWindow(hann, Size(100, 100), CV_32F);
}</pre>
@param dst Destination array to place Hann coefficients in
@param winSize The window size specifications
@param type Created array type
 */
@Namespace("cv") public static native void createHanningWindow(@ByVal Mat dst, @ByVal Size winSize, int type);

/** \} imgproc_motion
 <p>
 *  \addtogroup imgproc_misc
 *  \{
<p>
/** \brief Applies a fixed-level threshold to each array element.
<p>
The function applies fixed-level thresholding to a single-channel array. The function is typically
used to get a bi-level (binary) image out of a grayscale image ( cv::compare could be also used for
this purpose) or for removing a noise, that is, filtering out pixels with too small or too large
values. There are several types of thresholding supported by the function. They are determined by
type parameter.
<p>
Also, the special values cv::THRESH_OTSU or cv::THRESH_TRIANGLE may be combined with one of the
above values. In these cases, the function determines the optimal threshold value using the Otsu's
or Triangle algorithm and uses it instead of the specified thresh . The function returns the
computed threshold value. Currently, the Otsu's and Triangle methods are implemented only for 8-bit
images.
<p>
@param src input array (single-channel, 8-bit or 32-bit floating point).
@param dst output array of the same size and type as src.
@param thresh threshold value.
@param maxval maximum value to use with the THRESH_BINARY and THRESH_BINARY_INV thresholding
types.
@param type thresholding type (see the cv::ThresholdTypes).
<p>
\sa  adaptiveThreshold, findContours, compare, min, max
 */
@Namespace("cv") public static native double threshold( @ByVal Mat src, @ByVal Mat dst,
                               double thresh, double maxval, int type );


/** \brief Applies an adaptive threshold to an array.
<p>
The function transforms a grayscale image to a binary image according to the formulae:
-   **THRESH_BINARY**
    \f[dst(x,y) =  \fork{\texttt{maxValue}}{if \(src(x,y) > T(x,y)\)}{0}{otherwise}\f]
-   **THRESH_BINARY_INV**
    \f[dst(x,y) =  \fork{0}{if \(src(x,y) > T(x,y)\)}{\texttt{maxValue}}{otherwise}\f]
where \f$T(x,y)\f$ is a threshold calculated individually for each pixel (see adaptiveMethod parameter).
<p>
The function can process the image in-place.
<p>
@param src Source 8-bit single-channel image.
@param dst Destination image of the same size and the same type as src.
@param maxValue Non-zero value assigned to the pixels for which the condition is satisfied
@param adaptiveMethod Adaptive thresholding algorithm to use, see cv::AdaptiveThresholdTypes
@param thresholdType Thresholding type that must be either THRESH_BINARY or THRESH_BINARY_INV,
see cv::ThresholdTypes.
@param blockSize Size of a pixel neighborhood that is used to calculate a threshold value for the
pixel: 3, 5, 7, and so on.
@param C Constant subtracted from the mean or weighted mean (see the details below). Normally, it
is positive but may be zero or negative as well.
<p>
\sa  threshold, blur, GaussianBlur
 */
@Namespace("cv") public static native void adaptiveThreshold( @ByVal Mat src, @ByVal Mat dst,
                                     double maxValue, int adaptiveMethod,
                                     int thresholdType, int blockSize, double C );

/** \} imgproc_misc
 <p>
 *  \addtogroup imgproc_filter
 *  \{
<p>
/** \brief Blurs an image and downsamples it.
<p>
By default, size of the output image is computed as {@code Size((src.cols+1)/2, (src.rows+1)/2)}, but in
any case, the following conditions should be satisfied:
<p>
\f[\begin{array}{l} | \texttt{dstsize.width} *2-src.cols| \leq 2 \\ | \texttt{dstsize.height} *2-src.rows| \leq 2 \end{array}\f]
<p>
The function performs the downsampling step of the Gaussian pyramid construction. First, it
convolves the source image with the kernel:
<p>
\f[\frac{1}{256} \begin{bmatrix} 1 & 4 & 6 & 4 & 1  \\ 4 & 16 & 24 & 16 & 4  \\ 6 & 24 & 36 & 24 & 6  \\ 4 & 16 & 24 & 16 & 4  \\ 1 & 4 & 6 & 4 & 1 \end{bmatrix}\f]
<p>
Then, it downsamples the image by rejecting even rows and columns.
<p>
@param src input image.
@param dst output image; it has the specified size and the same type as src.
@param dstsize size of the output image.
@param borderType Pixel extrapolation method, see cv::BorderTypes (BORDER_CONSTANT isn't supported)
 */
@Namespace("cv") public static native void pyrDown( @ByVal Mat src, @ByVal Mat dst,
                           @Const @ByRef(nullValue = "cv::Size()") Size dstsize/*=cv::Size()*/, int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void pyrDown( @ByVal Mat src, @ByVal Mat dst );

/** \brief Upsamples an image and then blurs it.
<p>
By default, size of the output image is computed as {@code Size(src.cols\*2, (src.rows\*2)}, but in any
case, the following conditions should be satisfied:
<p>
\f[\begin{array}{l} | \texttt{dstsize.width} -src.cols*2| \leq  ( \texttt{dstsize.width}   \mod  2)  \\ | \texttt{dstsize.height} -src.rows*2| \leq  ( \texttt{dstsize.height}   \mod  2) \end{array}\f]
<p>
The function performs the upsampling step of the Gaussian pyramid construction, though it can
actually be used to construct the Laplacian pyramid. First, it upsamples the source image by
injecting even zero rows and columns and then convolves the result with the same kernel as in
pyrDown multiplied by 4.
<p>
@param src input image.
@param dst output image. It has the specified size and the same type as src .
@param dstsize size of the output image.
@param borderType Pixel extrapolation method, see cv::BorderTypes (only BORDER_DEFAULT is supported)
 */
@Namespace("cv") public static native void pyrUp( @ByVal Mat src, @ByVal Mat dst,
                         @Const @ByRef(nullValue = "cv::Size()") Size dstsize/*=cv::Size()*/, int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void pyrUp( @ByVal Mat src, @ByVal Mat dst );

/** \brief Constructs the Gaussian pyramid for an image.
<p>
The function constructs a vector of images and builds the Gaussian pyramid by recursively applying
pyrDown to the previously built pyramid layers, starting from {@code dst[0]==src}.
<p>
@param src Source image. Check pyrDown for the list of supported types.
@param dst Destination vector of maxlevel+1 images of the same type as src. dst[0] will be the
same as src. dst[1] is the next pyramid layer, a smoothed and down-sized src, and so on.
@param maxlevel 0-based index of the last (the smallest) pyramid layer. It must be non-negative.
@param borderType Pixel extrapolation method, see cv::BorderTypes (BORDER_CONSTANT isn't supported)
 */
@Namespace("cv") public static native void buildPyramid( @ByVal Mat src, @ByVal MatVector dst,
                              int maxlevel, int borderType/*=cv::BORDER_DEFAULT*/ );
@Namespace("cv") public static native void buildPyramid( @ByVal Mat src, @ByVal MatVector dst,
                              int maxlevel );

/** \} imgproc_filter
 <p>
 *  \addtogroup imgproc_transform
 *  \{
<p>
/** \brief Transforms an image to compensate for lens distortion.
<p>
The function transforms an image to compensate radial and tangential lens distortion.
<p>
The function is simply a combination of cv::initUndistortRectifyMap (with unity R ) and cv::remap
(with bilinear interpolation). See the former function for details of the transformation being
performed.
<p>
Those pixels in the destination image, for which there is no correspondent pixels in the source
image, are filled with zeros (black color).
<p>
A particular subset of the source image that will be visible in the corrected image can be regulated
by newCameraMatrix. You can use cv::getOptimalNewCameraMatrix to compute the appropriate
newCameraMatrix depending on your requirements.
<p>
The camera matrix and the distortion parameters can be determined using cv::calibrateCamera. If
the resolution of images is different from the resolution used at the calibration stage, \f$f_x,
f_y, c_x\f$ and \f$c_y\f$ need to be scaled accordingly, while the distortion coefficients remain
the same.
<p>
@param src Input (distorted) image.
@param dst Output (corrected) image that has the same size and type as src .
@param cameraMatrix Input camera matrix \f$A = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\f$ .
@param distCoeffs Input vector of distortion coefficients
\f$(k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\f$
of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
@param newCameraMatrix Camera matrix of the distorted image. By default, it is the same as
cameraMatrix but you may additionally scale and shift the result by using a different matrix.
 */
@Namespace("cv") public static native void undistort( @ByVal Mat src, @ByVal Mat dst,
                             @ByVal Mat cameraMatrix,
                             @ByVal Mat distCoeffs,
                             @ByVal(nullValue = "cv::noArray()") Mat newCameraMatrix/*=cv::noArray()*/ );
@Namespace("cv") public static native void undistort( @ByVal Mat src, @ByVal Mat dst,
                             @ByVal Mat cameraMatrix,
                             @ByVal Mat distCoeffs );

/** \brief Computes the undistortion and rectification transformation map.
<p>
The function computes the joint undistortion and rectification transformation and represents the
result in the form of maps for remap. The undistorted image looks like original, as if it is
captured with a camera using the camera matrix =newCameraMatrix and zero distortion. In case of a
monocular camera, newCameraMatrix is usually equal to cameraMatrix, or it can be computed by
cv::getOptimalNewCameraMatrix for a better control over scaling. In case of a stereo camera,
newCameraMatrix is normally set to P1 or P2 computed by cv::stereoRectify .
<p>
Also, this new camera is oriented differently in the coordinate space, according to R. That, for
example, helps to align two heads of a stereo camera so that the epipolar lines on both images
become horizontal and have the same y- coordinate (in case of a horizontally aligned stereo camera).
<p>
The function actually builds the maps for the inverse mapping algorithm that is used by remap. That
is, for each pixel \f$(u, v)\f$ in the destination (corrected and rectified) image, the function
computes the corresponding coordinates in the source image (that is, in the original image from
camera). The following process is applied:
\f[
\begin{array}{l}
x  \leftarrow (u - {c'}_x)/{f'}_x  \\
y  \leftarrow (v - {c'}_y)/{f'}_y  \\
{[X\,Y\,W]} ^T  \leftarrow R^{-1}*[x \, y \, 1]^T  \\
x'  \leftarrow X/W  \\
y'  \leftarrow Y/W  \\
r^2  \leftarrow x'^2 + y'^2 \\
x''  \leftarrow x' \frac{1 + k_1 r^2 + k_2 r^4 + k_3 r^6}{1 + k_4 r^2 + k_5 r^4 + k_6 r^6}
+ 2p_1 x' y' + p_2(r^2 + 2 x'^2)  + s_1 r^2 + s_2 r^4\\
y''  \leftarrow y' \frac{1 + k_1 r^2 + k_2 r^4 + k_3 r^6}{1 + k_4 r^2 + k_5 r^4 + k_6 r^6}
+ p_1 (r^2 + 2 y'^2) + 2 p_2 x' y' + s_3 r^2 + s_4 r^4 \\
s\vecthree{x'''}{y'''}{1} =
\vecthreethree{R_{33}(\tau_x, \tau_y)}{0}{-R_{13}((\tau_x, \tau_y)}
{0}{R_{33}(\tau_x, \tau_y)}{-R_{23}(\tau_x, \tau_y)}
{0}{0}{1} R(\tau_x, \tau_y) \vecthree{x''}{y''}{1}\\
map_x(u,v)  \leftarrow x''' f_x + c_x  \\
map_y(u,v)  \leftarrow y''' f_y + c_y
\end{array}
\f]
where \f$(k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\f$
are the distortion coefficients.
<p>
In case of a stereo camera, this function is called twice: once for each camera head, after
stereoRectify, which in its turn is called after cv::stereoCalibrate. But if the stereo camera
was not calibrated, it is still possible to compute the rectification transformations directly from
the fundamental matrix using cv::stereoRectifyUncalibrated. For each camera, the function computes
homography H as the rectification transformation in a pixel domain, not a rotation matrix R in 3D
space. R can be computed from H as
\f[\texttt{R} = \texttt{cameraMatrix} ^{-1} \cdot \texttt{H} \cdot \texttt{cameraMatrix}\f]
where cameraMatrix can be chosen arbitrarily.
<p>
@param cameraMatrix Input camera matrix \f$A=\vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\f$ .
@param distCoeffs Input vector of distortion coefficients
\f$(k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\f$
of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
@param R Optional rectification transformation in the object space (3x3 matrix). R1 or R2 ,
computed by stereoRectify can be passed here. If the matrix is empty, the identity transformation
is assumed. In cvInitUndistortMap R assumed to be an identity matrix.
@param newCameraMatrix New camera matrix \f$A'=\vecthreethree{f_x'}{0}{c_x'}{0}{f_y'}{c_y'}{0}{0}{1}\f$.
@param size Undistorted image size.
@param m1type Type of the first output map that can be CV_32FC1 or CV_16SC2, see cv::convertMaps
@param map1 The first output map.
@param map2 The second output map.
 */
@Namespace("cv") public static native void initUndistortRectifyMap( @ByVal Mat cameraMatrix, @ByVal Mat distCoeffs,
                           @ByVal Mat R, @ByVal Mat newCameraMatrix,
                           @ByVal Size size, int m1type, @ByVal Mat map1, @ByVal Mat map2 );

/** initializes maps for cv::remap() for wide-angle */
@Namespace("cv") public static native float initWideAngleProjMap( @ByVal Mat cameraMatrix, @ByVal Mat distCoeffs,
                                         @ByVal Size imageSize, int destImageWidth,
                                         int m1type, @ByVal Mat map1, @ByVal Mat map2,
                                         int projType/*=cv::PROJ_SPHERICAL_EQRECT*/, double alpha/*=0*/);
@Namespace("cv") public static native float initWideAngleProjMap( @ByVal Mat cameraMatrix, @ByVal Mat distCoeffs,
                                         @ByVal Size imageSize, int destImageWidth,
                                         int m1type, @ByVal Mat map1, @ByVal Mat map2);

/** \brief Returns the default new camera matrix.
<p>
The function returns the camera matrix that is either an exact copy of the input cameraMatrix (when
centerPrinicipalPoint=false ), or the modified one (when centerPrincipalPoint=true).
<p>
In the latter case, the new camera matrix will be:
<p>
\f[\begin{bmatrix} f_x && 0 && ( \texttt{imgSize.width} -1)*0.5  \\ 0 && f_y && ( \texttt{imgSize.height} -1)*0.5  \\ 0 && 0 && 1 \end{bmatrix} ,\f]
<p>
where \f$f_x\f$ and \f$f_y\f$ are \f$(0,0)\f$ and \f$(1,1)\f$ elements of cameraMatrix, respectively.
<p>
By default, the undistortion functions in OpenCV (see initUndistortRectifyMap, undistort) do not
move the principal point. However, when you work with stereo, it is important to move the principal
points in both views to the same y-coordinate (which is required by most of stereo correspondence
algorithms), and may be to the same x-coordinate too. So, you can form the new camera matrix for
each view where the principal points are located at the center.
<p>
@param cameraMatrix Input camera matrix.
@param imgsize Camera view image size in pixels.
@param centerPrincipalPoint Location of the principal point in the new camera matrix. The
parameter indicates whether this location should be at the image center or not.
 */
@Namespace("cv") public static native @ByVal Mat getDefaultNewCameraMatrix( @ByVal Mat cameraMatrix, @ByVal(nullValue = "cv::Size()") Size imgsize/*=cv::Size()*/,
                                            @Cast("bool") boolean centerPrincipalPoint/*=false*/ );
@Namespace("cv") public static native @ByVal Mat getDefaultNewCameraMatrix( @ByVal Mat cameraMatrix );

/** \brief Computes the ideal point coordinates from the observed point coordinates.
<p>
The function is similar to cv::undistort and cv::initUndistortRectifyMap but it operates on a
sparse set of points instead of a raster image. Also the function performs a reverse transformation
to projectPoints. In case of a 3D object, it does not reconstruct its 3D coordinates, but for a
planar object, it does, up to a translation vector, if the proper R is specified.
<pre>{@code
    // (u,v) is the input point, (u', v') is the output point
    // camera_matrix=[fx 0 cx; 0 fy cy; 0 0 1]
    // P=[fx' 0 cx' tx; 0 fy' cy' ty; 0 0 1 tz]
    x" = (u - cx)/fx
    y" = (v - cy)/fy
    (x',y') = undistort(x",y",dist_coeffs)
    [X,Y,W]T = R*[x' y' 1]T
    x = X/W, y = Y/W
    // only performed if P=[fx' 0 cx' [tx]; 0 fy' cy' [ty]; 0 0 1 [tz]] is specified
    u' = x*fx' + cx'
    v' = y*fy' + cy',
}</pre>
where cv::undistort is an approximate iterative algorithm that estimates the normalized original
point coordinates out of the normalized distorted point coordinates ("normalized" means that the
coordinates do not depend on the camera matrix).
<p>
The function can be used for both a stereo camera head or a monocular camera (when R is empty).
<p>
@param src Observed point coordinates, 1xN or Nx1 2-channel (CV_32FC2 or CV_64FC2).
@param dst Output ideal point coordinates after undistortion and reverse perspective
transformation. If matrix P is identity or omitted, dst will contain normalized point coordinates.
@param cameraMatrix Camera matrix \f$\vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\f$ .
@param distCoeffs Input vector of distortion coefficients
\f$(k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\f$
of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
@param R Rectification transformation in the object space (3x3 matrix). R1 or R2 computed by
cv::stereoRectify can be passed here. If the matrix is empty, the identity transformation is used.
@param P New camera matrix (3x3) or new projection matrix (3x4). P1 or P2 computed by
cv::stereoRectify can be passed here. If the matrix is empty, the identity new camera matrix is used.
 */
@Namespace("cv") public static native void undistortPoints( @ByVal Mat src, @ByVal Mat dst,
                                   @ByVal Mat cameraMatrix, @ByVal Mat distCoeffs,
                                   @ByVal(nullValue = "cv::noArray()") Mat R/*=cv::noArray()*/, @ByVal(nullValue = "cv::noArray()") Mat P/*=cv::noArray()*/);
@Namespace("cv") public static native void undistortPoints( @ByVal Mat src, @ByVal Mat dst,
                                   @ByVal Mat cameraMatrix, @ByVal Mat distCoeffs);

/** \} imgproc_transform
 <p>
 *  \addtogroup imgproc_hist
 *  \{
<p>
/** \example demhist.cpp
An example for creating histograms of an image
*/

/** \brief Calculates a histogram of a set of arrays.
<p>
The functions calcHist calculate the histogram of one or more arrays. The elements of a tuple used
to increment a histogram bin are taken from the corresponding input arrays at the same location. The
sample below shows how to compute a 2D Hue-Saturation histogram for a color image. :
<pre>{@code
    #include <opencv2/imgproc.hpp>
    #include <opencv2/highgui.hpp>

    using namespace cv;

    int main( int argc, char** argv )
    {
        Mat src, hsv;
        if( argc != 2 || !(src=imread(argv[1], 1)).data )
            return -1;

        cvtColor(src, hsv, COLOR_BGR2HSV);

        // Quantize the hue to 30 levels
        // and the saturation to 32 levels
        int hbins = 30, sbins = 32;
        int histSize[] = {hbins, sbins};
        // hue varies from 0 to 179, see cvtColor
        float hranges[] = { 0, 180 };
        // saturation varies from 0 (black-gray-white) to
        // 255 (pure spectrum color)
        float sranges[] = { 0, 256 };
        const float* ranges[] = { hranges, sranges };
        MatND hist;
        // we compute the histogram from the 0-th and 1-st channels
        int channels[] = {0, 1};

        calcHist( &hsv, 1, channels, Mat(), // do not use mask
                 hist, 2, histSize, ranges,
                 true, // the histogram is uniform
                 false );
        double maxVal=0;
        minMaxLoc(hist, 0, &maxVal, 0, 0);

        int scale = 10;
        Mat histImg = Mat::zeros(sbins*scale, hbins*10, CV_8UC3);

        for( int h = 0; h < hbins; h++ )
            for( int s = 0; s < sbins; s++ )
            {
                float binVal = hist.at<float>(h, s);
                int intensity = cvRound(binVal*255/maxVal);
                rectangle( histImg, Point(h*scale, s*scale),
                            Point( (h+1)*scale - 1, (s+1)*scale - 1),
                            Scalar::all(intensity),
                            CV_FILLED );
            }

        namedWindow( "Source", 1 );
        imshow( "Source", src );

        namedWindow( "H-S Histogram", 1 );
        imshow( "H-S Histogram", histImg );
        waitKey();
    }
}</pre>
<p>
@param images Source arrays. They all should have the same depth, CV_8U or CV_32F , and the same
size. Each of them can have an arbitrary number of channels.
@param nimages Number of source images.
@param channels List of the dims channels used to compute the histogram. The first array channels
are numerated from 0 to images[0].channels()-1 , the second array channels are counted from
images[0].channels() to images[0].channels() + images[1].channels()-1, and so on.
@param mask Optional mask. If the matrix is not empty, it must be an 8-bit array of the same size
as images[i] . The non-zero mask elements mark the array elements counted in the histogram.
@param hist Output histogram, which is a dense or sparse dims -dimensional array.
@param dims Histogram dimensionality that must be positive and not greater than CV_MAX_DIMS
(equal to 32 in the current OpenCV version).
@param histSize Array of histogram sizes in each dimension.
@param ranges Array of the dims arrays of the histogram bin boundaries in each dimension. When the
histogram is uniform ( uniform =true), then for each dimension i it is enough to specify the lower
(inclusive) boundary \f$L_0\f$ of the 0-th histogram bin and the upper (exclusive) boundary
\f$U_{\texttt{histSize}[i]-1}\f$ for the last histogram bin histSize[i]-1 . That is, in case of a
uniform histogram each of ranges[i] is an array of 2 elements. When the histogram is not uniform (
uniform=false ), then each of ranges[i] contains histSize[i]+1 elements:
\f$L_0, U_0=L_1, U_1=L_2, ..., U_{\texttt{histSize[i]}-2}=L_{\texttt{histSize[i]}-1}, U_{\texttt{histSize[i]}-1}\f$
. The array elements, that are not between \f$L_0\f$ and \f$U_{\texttt{histSize[i]}-1}\f$ , are not
counted in the histogram.
@param uniform Flag indicating whether the histogram is uniform or not (see above).
@param accumulate Accumulation flag. If it is set, the histogram is not cleared in the beginning
when it is allocated. This feature enables you to compute a single histogram from several sets of
arrays, or to update the histogram in time.
*/
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const IntPointer channels, @ByVal Mat mask,
                          @ByVal Mat hist, int dims, @Const IntPointer histSize,
                          @Cast("const float**") PointerPointer ranges, @Cast("bool") boolean uniform/*=true*/, @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const IntPointer channels, @ByVal Mat mask,
                          @ByVal Mat hist, int dims, @Const IntPointer histSize,
                          @Const @ByPtrPtr FloatPointer ranges );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const IntPointer channels, @ByVal Mat mask,
                          @ByVal Mat hist, int dims, @Const IntPointer histSize,
                          @Const @ByPtrPtr FloatPointer ranges, @Cast("bool") boolean uniform/*=true*/, @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const IntBuffer channels, @ByVal Mat mask,
                          @ByVal Mat hist, int dims, @Const IntBuffer histSize,
                          @Const @ByPtrPtr FloatBuffer ranges, @Cast("bool") boolean uniform/*=true*/, @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const IntBuffer channels, @ByVal Mat mask,
                          @ByVal Mat hist, int dims, @Const IntBuffer histSize,
                          @Const @ByPtrPtr FloatBuffer ranges );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const int[] channels, @ByVal Mat mask,
                          @ByVal Mat hist, int dims, @Const int[] histSize,
                          @Const @ByPtrPtr float[] ranges, @Cast("bool") boolean uniform/*=true*/, @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const int[] channels, @ByVal Mat mask,
                          @ByVal Mat hist, int dims, @Const int[] histSize,
                          @Const @ByPtrPtr float[] ranges );

/** \overload
<p>
this variant uses cv::SparseMat for output
*/
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const IntPointer channels, @ByVal Mat mask,
                          @ByRef SparseMat hist, int dims,
                          @Const IntPointer histSize, @Cast("const float**") PointerPointer ranges,
                          @Cast("bool") boolean uniform/*=true*/, @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const IntPointer channels, @ByVal Mat mask,
                          @ByRef SparseMat hist, int dims,
                          @Const IntPointer histSize, @Const @ByPtrPtr FloatPointer ranges );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const IntPointer channels, @ByVal Mat mask,
                          @ByRef SparseMat hist, int dims,
                          @Const IntPointer histSize, @Const @ByPtrPtr FloatPointer ranges,
                          @Cast("bool") boolean uniform/*=true*/, @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const IntBuffer channels, @ByVal Mat mask,
                          @ByRef SparseMat hist, int dims,
                          @Const IntBuffer histSize, @Const @ByPtrPtr FloatBuffer ranges,
                          @Cast("bool") boolean uniform/*=true*/, @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const IntBuffer channels, @ByVal Mat mask,
                          @ByRef SparseMat hist, int dims,
                          @Const IntBuffer histSize, @Const @ByPtrPtr FloatBuffer ranges );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const int[] channels, @ByVal Mat mask,
                          @ByRef SparseMat hist, int dims,
                          @Const int[] histSize, @Const @ByPtrPtr float[] ranges,
                          @Cast("bool") boolean uniform/*=true*/, @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @Const Mat images, int nimages,
                          @Const int[] channels, @ByVal Mat mask,
                          @ByRef SparseMat hist, int dims,
                          @Const int[] histSize, @Const @ByPtrPtr float[] ranges );

/** \overload */
@Namespace("cv") public static native void calcHist( @ByVal MatVector images,
                            @StdVector IntPointer channels,
                            @ByVal Mat mask, @ByVal Mat hist,
                            @StdVector IntPointer histSize,
                            @StdVector FloatPointer ranges,
                            @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @ByVal MatVector images,
                            @StdVector IntPointer channels,
                            @ByVal Mat mask, @ByVal Mat hist,
                            @StdVector IntPointer histSize,
                            @StdVector FloatPointer ranges );
@Namespace("cv") public static native void calcHist( @ByVal MatVector images,
                            @StdVector IntBuffer channels,
                            @ByVal Mat mask, @ByVal Mat hist,
                            @StdVector IntBuffer histSize,
                            @StdVector FloatBuffer ranges,
                            @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @ByVal MatVector images,
                            @StdVector IntBuffer channels,
                            @ByVal Mat mask, @ByVal Mat hist,
                            @StdVector IntBuffer histSize,
                            @StdVector FloatBuffer ranges );
@Namespace("cv") public static native void calcHist( @ByVal MatVector images,
                            @StdVector int[] channels,
                            @ByVal Mat mask, @ByVal Mat hist,
                            @StdVector int[] histSize,
                            @StdVector float[] ranges,
                            @Cast("bool") boolean accumulate/*=false*/ );
@Namespace("cv") public static native void calcHist( @ByVal MatVector images,
                            @StdVector int[] channels,
                            @ByVal Mat mask, @ByVal Mat hist,
                            @StdVector int[] histSize,
                            @StdVector float[] ranges );

/** \brief Calculates the back projection of a histogram.
<p>
The functions calcBackProject calculate the back project of the histogram. That is, similarly to
cv::calcHist , at each location (x, y) the function collects the values from the selected channels
in the input images and finds the corresponding histogram bin. But instead of incrementing it, the
function reads the bin value, scales it by scale , and stores in backProject(x,y) . In terms of
statistics, the function computes probability of each element value in respect with the empirical
probability distribution represented by the histogram. See how, for example, you can find and track
a bright-colored object in a scene:
<p>
- Before tracking, show the object to the camera so that it covers almost the whole frame.
Calculate a hue histogram. The histogram may have strong maximums, corresponding to the dominant
colors in the object.
<p>
- When tracking, calculate a back projection of a hue plane of each input video frame using that
pre-computed histogram. Threshold the back projection to suppress weak colors. It may also make
sense to suppress pixels with non-sufficient color saturation and too dark or too bright pixels.
<p>
- Find connected components in the resulting picture and choose, for example, the largest
component.
<p>
This is an approximate algorithm of the CamShift color object tracker.
<p>
@param images Source arrays. They all should have the same depth, CV_8U or CV_32F , and the same
size. Each of them can have an arbitrary number of channels.
@param nimages Number of source images.
@param channels The list of channels used to compute the back projection. The number of channels
must match the histogram dimensionality. The first array channels are numerated from 0 to
images[0].channels()-1 , the second array channels are counted from images[0].channels() to
images[0].channels() + images[1].channels()-1, and so on.
@param hist Input histogram that can be dense or sparse.
@param backProject Destination back projection array that is a single-channel array of the same
size and depth as images[0] .
@param ranges Array of arrays of the histogram bin boundaries in each dimension. See calcHist .
@param scale Optional scale factor for the output back projection.
@param uniform Flag indicating whether the histogram is uniform or not (see above).
<p>
\sa cv::calcHist, cv::compareHist
 */
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const IntPointer channels, @ByVal Mat hist,
                                 @ByVal Mat backProject, @Cast("const float**") PointerPointer ranges,
                                 double scale/*=1*/, @Cast("bool") boolean uniform/*=true*/ );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const IntPointer channels, @ByVal Mat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr FloatPointer ranges );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const IntPointer channels, @ByVal Mat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr FloatPointer ranges,
                                 double scale/*=1*/, @Cast("bool") boolean uniform/*=true*/ );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const IntBuffer channels, @ByVal Mat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr FloatBuffer ranges,
                                 double scale/*=1*/, @Cast("bool") boolean uniform/*=true*/ );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const IntBuffer channels, @ByVal Mat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr FloatBuffer ranges );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const int[] channels, @ByVal Mat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr float[] ranges,
                                 double scale/*=1*/, @Cast("bool") boolean uniform/*=true*/ );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const int[] channels, @ByVal Mat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr float[] ranges );

/** \overload */
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const IntPointer channels, @Const @ByRef SparseMat hist,
                                 @ByVal Mat backProject, @Cast("const float**") PointerPointer ranges,
                                 double scale/*=1*/, @Cast("bool") boolean uniform/*=true*/ );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const IntPointer channels, @Const @ByRef SparseMat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr FloatPointer ranges );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const IntPointer channels, @Const @ByRef SparseMat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr FloatPointer ranges,
                                 double scale/*=1*/, @Cast("bool") boolean uniform/*=true*/ );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const IntBuffer channels, @Const @ByRef SparseMat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr FloatBuffer ranges,
                                 double scale/*=1*/, @Cast("bool") boolean uniform/*=true*/ );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const IntBuffer channels, @Const @ByRef SparseMat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr FloatBuffer ranges );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const int[] channels, @Const @ByRef SparseMat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr float[] ranges,
                                 double scale/*=1*/, @Cast("bool") boolean uniform/*=true*/ );
@Namespace("cv") public static native void calcBackProject( @Const Mat images, int nimages,
                                 @Const int[] channels, @Const @ByRef SparseMat hist,
                                 @ByVal Mat backProject, @Const @ByPtrPtr float[] ranges );

/** \overload */
@Namespace("cv") public static native void calcBackProject( @ByVal MatVector images, @StdVector IntPointer channels,
                                   @ByVal Mat hist, @ByVal Mat dst,
                                   @StdVector FloatPointer ranges,
                                   double scale );
@Namespace("cv") public static native void calcBackProject( @ByVal MatVector images, @StdVector IntBuffer channels,
                                   @ByVal Mat hist, @ByVal Mat dst,
                                   @StdVector FloatBuffer ranges,
                                   double scale );
@Namespace("cv") public static native void calcBackProject( @ByVal MatVector images, @StdVector int[] channels,
                                   @ByVal Mat hist, @ByVal Mat dst,
                                   @StdVector float[] ranges,
                                   double scale );

/** \brief Compares two histograms.
<p>
The function compare two dense or two sparse histograms using the specified method.
<p>
The function returns \f$d(H_1, H_2)\f$ .
<p>
While the function works well with 1-, 2-, 3-dimensional dense histograms, it may not be suitable
for high-dimensional sparse histograms. In such histograms, because of aliasing and sampling
problems, the coordinates of non-zero histogram bins can slightly shift. To compare such histograms
or more general sparse configurations of weighted points, consider using the cv::EMD function.
<p>
@param H1 First compared histogram.
@param H2 Second compared histogram of the same size as H1 .
@param method Comparison method, see cv::HistCompMethods
 */
@Namespace("cv") public static native double compareHist( @ByVal Mat H1, @ByVal Mat H2, int method );

/** \overload */
@Namespace("cv") public static native double compareHist( @Const @ByRef SparseMat H1, @Const @ByRef SparseMat H2, int method );

/** \brief Equalizes the histogram of a grayscale image.
<p>
The function equalizes the histogram of the input image using the following algorithm:
<p>
- Calculate the histogram \f$H\f$ for src .
- Normalize the histogram so that the sum of histogram bins is 255.
- Compute the integral of the histogram:
\f[H'_i =  \sum _{0  \le j < i} H(j)\f]
- Transform the image using \f$H'\f$ as a look-up table: \f$\texttt{dst}(x,y) = H'(\texttt{src}(x,y))\f$
<p>
The algorithm normalizes the brightness and increases the contrast of the image.
<p>
@param src Source 8-bit single channel image.
@param dst Destination image of the same size and type as src .
 */
@Namespace("cv") public static native void equalizeHist( @ByVal Mat src, @ByVal Mat dst );

/** \brief Computes the "minimal work" distance between two weighted point configurations.
<p>
The function computes the earth mover distance and/or a lower boundary of the distance between the
two weighted point configurations. One of the applications described in \cite RubnerSept98,
\cite Rubner2000 is multi-dimensional histogram comparison for image retrieval. EMD is a transportation
problem that is solved using some modification of a simplex algorithm, thus the complexity is
exponential in the worst case, though, on average it is much faster. In the case of a real metric
the lower boundary can be calculated even faster (using linear-time algorithm) and it can be used
to determine roughly whether the two signatures are far enough so that they cannot relate to the
same object.
<p>
@param signature1 First signature, a \f$\texttt{size1}\times \texttt{dims}+1\f$ floating-point matrix.
Each row stores the point weight followed by the point coordinates. The matrix is allowed to have
a single column (weights only) if the user-defined cost matrix is used.
@param signature2 Second signature of the same format as signature1 , though the number of rows
may be different. The total weights may be different. In this case an extra "dummy" point is added
to either signature1 or signature2 .
@param distType Used metric. See cv::DistanceTypes.
@param cost User-defined \f$\texttt{size1}\times \texttt{size2}\f$ cost matrix. Also, if a cost matrix
is used, lower boundary lowerBound cannot be calculated because it needs a metric function.
@param lowerBound Optional input/output parameter: lower boundary of a distance between the two
signatures that is a distance between mass centers. The lower boundary may not be calculated if
the user-defined cost matrix is used, the total weights of point configurations are not equal, or
if the signatures consist of weights only (the signature matrices have a single column). You
**must** initialize \*lowerBound . If the calculated distance between mass centers is greater or
equal to \*lowerBound (it means that the signatures are far enough), the function does not
calculate EMD. In any case \*lowerBound is set to the calculated distance between mass centers on
return. Thus, if you want to calculate both distance between mass centers and EMD, \*lowerBound
should be set to 0.
@param flow Resultant \f$\texttt{size1} \times \texttt{size2}\f$ flow matrix: \f$\texttt{flow}_{i,j}\f$ is
a flow from \f$i\f$ -th point of signature1 to \f$j\f$ -th point of signature2 .
 */
@Namespace("cv") public static native float EMD( @ByVal Mat signature1, @ByVal Mat signature2,
                      int distType, @ByVal(nullValue = "cv::noArray()") Mat cost/*=cv::noArray()*/,
                      FloatPointer lowerBound/*=0*/, @ByVal(nullValue = "cv::noArray()") Mat flow/*=cv::noArray()*/ );
@Namespace("cv") public static native float EMD( @ByVal Mat signature1, @ByVal Mat signature2,
                      int distType );
@Namespace("cv") public static native float EMD( @ByVal Mat signature1, @ByVal Mat signature2,
                      int distType, @ByVal(nullValue = "cv::noArray()") Mat cost/*=cv::noArray()*/,
                      FloatBuffer lowerBound/*=0*/, @ByVal(nullValue = "cv::noArray()") Mat flow/*=cv::noArray()*/ );
@Namespace("cv") public static native float EMD( @ByVal Mat signature1, @ByVal Mat signature2,
                      int distType, @ByVal(nullValue = "cv::noArray()") Mat cost/*=cv::noArray()*/,
                      float[] lowerBound/*=0*/, @ByVal(nullValue = "cv::noArray()") Mat flow/*=cv::noArray()*/ );

/** \} imgproc_hist
<p>
/** \example watershed.cpp
An example using the watershed algorithm
 */

/** \brief Performs a marker-based image segmentation using the watershed algorithm.
<p>
The function implements one of the variants of watershed, non-parametric marker-based segmentation
algorithm, described in \cite Meyer92 .
<p>
Before passing the image to the function, you have to roughly outline the desired regions in the
image markers with positive (\>0) indices. So, every region is represented as one or more connected
components with the pixel values 1, 2, 3, and so on. Such markers can be retrieved from a binary
mask using findContours and drawContours (see the watershed.cpp demo). The markers are "seeds" of
the future image regions. All the other pixels in markers , whose relation to the outlined regions
is not known and should be defined by the algorithm, should be set to 0's. In the function output,
each pixel in markers is set to a value of the "seed" components or to -1 at boundaries between the
regions.
<p>
\note Any two neighbor connected components are not necessarily separated by a watershed boundary
(-1's pixels); for example, they can touch each other in the initial marker image passed to the
function.
<p>
@param image Input 8-bit 3-channel image.
@param markers Input/output 32-bit single-channel image (map) of markers. It should have the same
size as image .
<p>
\sa findContours
<p>
\ingroup imgproc_misc
 */
@Namespace("cv") public static native void watershed( @ByVal Mat image, @ByVal Mat markers );

/** \addtogroup imgproc_filter
 *  \{
<p>
/** \brief Performs initial step of meanshift segmentation of an image.
<p>
The function implements the filtering stage of meanshift segmentation, that is, the output of the
function is the filtered "posterized" image with color gradients and fine-grain texture flattened.
At every pixel (X,Y) of the input image (or down-sized input image, see below) the function executes
meanshift iterations, that is, the pixel (X,Y) neighborhood in the joint space-color hyperspace is
considered:
<p>
\f[(x,y): X- \texttt{sp} \le x  \le X+ \texttt{sp} , Y- \texttt{sp} \le y  \le Y+ \texttt{sp} , ||(R,G,B)-(r,g,b)||   \le \texttt{sr}\f]
<p>
where (R,G,B) and (r,g,b) are the vectors of color components at (X,Y) and (x,y), respectively
(though, the algorithm does not depend on the color space used, so any 3-component color space can
be used instead). Over the neighborhood the average spatial value (X',Y') and average color vector
(R',G',B') are found and they act as the neighborhood center on the next iteration:
<p>
\f[(X,Y)~(X',Y'), (R,G,B)~(R',G',B').\f]
<p>
After the iterations over, the color components of the initial pixel (that is, the pixel from where
the iterations started) are set to the final value (average color at the last iteration):
<p>
\f[I(X,Y) <- (R*,G*,B*)\f]
<p>
When maxLevel \> 0, the gaussian pyramid of maxLevel+1 levels is built, and the above procedure is
run on the smallest layer first. After that, the results are propagated to the larger layer and the
iterations are run again only on those pixels where the layer colors differ by more than sr from the
lower-resolution layer of the pyramid. That makes boundaries of color regions sharper. Note that the
results will be actually different from the ones obtained by running the meanshift procedure on the
whole original image (i.e. when maxLevel==0).
<p>
@param src The source 8-bit, 3-channel image.
@param dst The destination image of the same format and the same size as the source.
@param sp The spatial window radius.
@param sr The color window radius.
@param maxLevel Maximum level of the pyramid for the segmentation.
@param termcrit Termination criteria: when to stop meanshift iterations.
 */
@Namespace("cv") public static native void pyrMeanShiftFiltering( @ByVal Mat src, @ByVal Mat dst,
                                         double sp, double sr, int maxLevel/*=1*/,
                                         @ByVal(nullValue = "cv::TermCriteria(cv::TermCriteria::MAX_ITER+cv::TermCriteria::EPS,5,1)") TermCriteria termcrit/*=cv::TermCriteria(cv::TermCriteria::MAX_ITER+cv::TermCriteria::EPS,5,1)*/ );
@Namespace("cv") public static native void pyrMeanShiftFiltering( @ByVal Mat src, @ByVal Mat dst,
                                         double sp, double sr );

/** \}
 <p>
 *  \addtogroup imgproc_misc
 *  \{
<p>
/** \example grabcut.cpp
An example using the GrabCut algorithm
 */

/** \brief Runs the GrabCut algorithm.
<p>
The function implements the [GrabCut image segmentation algorithm](http://en.wikipedia.org/wiki/GrabCut).
<p>
@param img Input 8-bit 3-channel image.
@param mask Input/output 8-bit single-channel mask. The mask is initialized by the function when
mode is set to GC_INIT_WITH_RECT. Its elements may have one of the cv::GrabCutClasses.
@param rect ROI containing a segmented object. The pixels outside of the ROI are marked as
"obvious background". The parameter is only used when mode==GC_INIT_WITH_RECT .
@param bgdModel Temporary array for the background model. Do not modify it while you are
processing the same image.
@param fgdModel Temporary arrays for the foreground model. Do not modify it while you are
processing the same image.
@param iterCount Number of iterations the algorithm should make before returning the result. Note
that the result can be refined with further calls with mode==GC_INIT_WITH_MASK or
mode==GC_EVAL .
@param mode Operation mode that could be one of the cv::GrabCutModes
 */
@Namespace("cv") public static native void grabCut( @ByVal Mat img, @ByVal Mat mask, @ByVal Rect rect,
                           @ByVal Mat bgdModel, @ByVal Mat fgdModel,
                           int iterCount, int mode/*=cv::GC_EVAL*/ );
@Namespace("cv") public static native void grabCut( @ByVal Mat img, @ByVal Mat mask, @ByVal Rect rect,
                           @ByVal Mat bgdModel, @ByVal Mat fgdModel,
                           int iterCount );

/** \example distrans.cpp
An example on using the distance transform\
*/


/** \brief Calculates the distance to the closest zero pixel for each pixel of the source image.
<p>
The functions distanceTransform calculate the approximate or precise distance from every binary
image pixel to the nearest zero pixel. For zero image pixels, the distance will obviously be zero.
<p>
When maskSize == DIST_MASK_PRECISE and distanceType == DIST_L2 , the function runs the
algorithm described in \cite Felzenszwalb04 . This algorithm is parallelized with the TBB library.
<p>
In other cases, the algorithm \cite Borgefors86 is used. This means that for a pixel the function
finds the shortest path to the nearest zero pixel consisting of basic shifts: horizontal, vertical,
diagonal, or knight's move (the latest is available for a \f$5\times 5\f$ mask). The overall
distance is calculated as a sum of these basic distances. Since the distance function should be
symmetric, all of the horizontal and vertical shifts must have the same cost (denoted as a ), all
the diagonal shifts must have the same cost (denoted as {@code b}), and all knight's moves must have the
same cost (denoted as {@code c}). For the cv::DIST_C and cv::DIST_L1 types, the distance is calculated
precisely, whereas for cv::DIST_L2 (Euclidean distance) the distance can be calculated only with a
relative error (a \f$5\times 5\f$ mask gives more accurate results). For {@code a},{@code b}, and {@code c}, OpenCV
uses the values suggested in the original paper:
- DIST_L1: {@code a = 1, b = 2}
- DIST_L2:
    - {@code 3 x 3}: {@code a=0.955, b=1.3693}
    - {@code 5 x 5}: {@code a=1, b=1.4, c=2.1969}
- DIST_C: {@code a = 1, b = 1}
<p>
Typically, for a fast, coarse distance estimation DIST_L2, a \f$3\times 3\f$ mask is used. For a
more accurate distance estimation DIST_L2, a \f$5\times 5\f$ mask or the precise algorithm is used.
Note that both the precise and the approximate algorithms are linear on the number of pixels.
<p>
This variant of the function does not only compute the minimum distance for each pixel \f$(x, y)\f$
but also identifies the nearest connected component consisting of zero pixels
(labelType==DIST_LABEL_CCOMP) or the nearest zero pixel (labelType==DIST_LABEL_PIXEL). Index of the
component/pixel is stored in {@code labels(x, y)}. When labelType==DIST_LABEL_CCOMP, the function
automatically finds connected components of zero pixels in the input image and marks them with
distinct labels. When labelType==DIST_LABEL_CCOMP, the function scans through the input image and
marks all the zero pixels with distinct labels.
<p>
In this mode, the complexity is still linear. That is, the function provides a very fast way to
compute the Voronoi diagram for a binary image. Currently, the second variant can use only the
approximate distance transform algorithm, i.e. maskSize=DIST_MASK_PRECISE is not supported
yet.
<p>
@param src 8-bit, single-channel (binary) source image.
@param dst Output image with calculated distances. It is a 8-bit or 32-bit floating-point,
single-channel image of the same size as src.
@param labels Output 2D array of labels (the discrete Voronoi diagram). It has the type
CV_32SC1 and the same size as src.
@param distanceType Type of distance, see cv::DistanceTypes
@param maskSize Size of the distance transform mask, see cv::DistanceTransformMasks.
DIST_MASK_PRECISE is not supported by this variant. In case of the DIST_L1 or DIST_C distance type,
the parameter is forced to 3 because a \f$3\times 3\f$ mask gives the same result as \f$5\times
5\f$ or any larger aperture.
@param labelType Type of the label array to build, see cv::DistanceTransformLabelTypes.
 */
@Namespace("cv") public static native @Name("distanceTransform") void distanceTransformWithLabels( @ByVal Mat src, @ByVal Mat dst,
                                     @ByVal Mat labels, int distanceType, int maskSize,
                                     int labelType/*=cv::DIST_LABEL_CCOMP*/ );
@Namespace("cv") public static native @Name("distanceTransform") void distanceTransformWithLabels( @ByVal Mat src, @ByVal Mat dst,
                                     @ByVal Mat labels, int distanceType, int maskSize );

/** \overload
@param src 8-bit, single-channel (binary) source image.
@param dst Output image with calculated distances. It is a 8-bit or 32-bit floating-point,
single-channel image of the same size as src .
@param distanceType Type of distance, see cv::DistanceTypes
@param maskSize Size of the distance transform mask, see cv::DistanceTransformMasks. In case of the
DIST_L1 or DIST_C distance type, the parameter is forced to 3 because a \f$3\times 3\f$ mask gives
the same result as \f$5\times 5\f$ or any larger aperture.
@param dstType Type of output image. It can be CV_8U or CV_32F. Type CV_8U can be used only for
the first variant of the function and distanceType == DIST_L1.
*/
@Namespace("cv") public static native void distanceTransform( @ByVal Mat src, @ByVal Mat dst,
                                     int distanceType, int maskSize, int dstType/*=CV_32F*/);
@Namespace("cv") public static native void distanceTransform( @ByVal Mat src, @ByVal Mat dst,
                                     int distanceType, int maskSize);

/** \example ffilldemo.cpp
  An example using the FloodFill technique
*/

/** \overload
<p>
variant without {@code mask} parameter
*/
@Namespace("cv") public static native int floodFill( @ByVal Mat image,
                          @ByVal Point seedPoint, @ByVal Scalar newVal, Rect rect/*=0*/,
                          @ByVal(nullValue = "cv::Scalar()") Scalar loDiff/*=cv::Scalar()*/, @ByVal(nullValue = "cv::Scalar()") Scalar upDiff/*=cv::Scalar()*/,
                          int flags/*=4*/ );
@Namespace("cv") public static native int floodFill( @ByVal Mat image,
                          @ByVal Point seedPoint, @ByVal Scalar newVal );

/** \brief Fills a connected component with the given color.
<p>
The functions floodFill fill a connected component starting from the seed point with the specified
color. The connectivity is determined by the color/brightness closeness of the neighbor pixels. The
pixel at \f$(x,y)\f$ is considered to belong to the repainted domain if:
<p>
- in case of a grayscale image and floating range
\f[\texttt{src} (x',y')- \texttt{loDiff} \leq \texttt{src} (x,y)  \leq \texttt{src} (x',y')+ \texttt{upDiff}\f]
<p>
<p>
- in case of a grayscale image and fixed range
\f[\texttt{src} ( \texttt{seedPoint} .x, \texttt{seedPoint} .y)- \texttt{loDiff} \leq \texttt{src} (x,y)  \leq \texttt{src} ( \texttt{seedPoint} .x, \texttt{seedPoint} .y)+ \texttt{upDiff}\f]
<p>
<p>
- in case of a color image and floating range
\f[\texttt{src} (x',y')_r- \texttt{loDiff} _r \leq \texttt{src} (x,y)_r \leq \texttt{src} (x',y')_r+ \texttt{upDiff} _r,\f]
\f[\texttt{src} (x',y')_g- \texttt{loDiff} _g \leq \texttt{src} (x,y)_g \leq \texttt{src} (x',y')_g+ \texttt{upDiff} _g\f]
and
\f[\texttt{src} (x',y')_b- \texttt{loDiff} _b \leq \texttt{src} (x,y)_b \leq \texttt{src} (x',y')_b+ \texttt{upDiff} _b\f]
<p>
<p>
- in case of a color image and fixed range
\f[\texttt{src} ( \texttt{seedPoint} .x, \texttt{seedPoint} .y)_r- \texttt{loDiff} _r \leq \texttt{src} (x,y)_r \leq \texttt{src} ( \texttt{seedPoint} .x, \texttt{seedPoint} .y)_r+ \texttt{upDiff} _r,\f]
\f[\texttt{src} ( \texttt{seedPoint} .x, \texttt{seedPoint} .y)_g- \texttt{loDiff} _g \leq \texttt{src} (x,y)_g \leq \texttt{src} ( \texttt{seedPoint} .x, \texttt{seedPoint} .y)_g+ \texttt{upDiff} _g\f]
and
\f[\texttt{src} ( \texttt{seedPoint} .x, \texttt{seedPoint} .y)_b- \texttt{loDiff} _b \leq \texttt{src} (x,y)_b \leq \texttt{src} ( \texttt{seedPoint} .x, \texttt{seedPoint} .y)_b+ \texttt{upDiff} _b\f]
<p>
<p>
where \f$src(x',y')\f$ is the value of one of pixel neighbors that is already known to belong to the
component. That is, to be added to the connected component, a color/brightness of the pixel should
be close enough to:
- Color/brightness of one of its neighbors that already belong to the connected component in case
of a floating range.
- Color/brightness of the seed point in case of a fixed range.
<p>
Use these functions to either mark a connected component with the specified color in-place, or build
a mask and then extract the contour, or copy the region to another image, and so on.
<p>
@param image Input/output 1- or 3-channel, 8-bit, or floating-point image. It is modified by the
function unless the FLOODFILL_MASK_ONLY flag is set in the second variant of the function. See
the details below.
@param mask Operation mask that should be a single-channel 8-bit image, 2 pixels wider and 2 pixels
taller than image. Since this is both an input and output parameter, you must take responsibility
of initializing it. Flood-filling cannot go across non-zero pixels in the input mask. For example,
an edge detector output can be used as a mask to stop filling at edges. On output, pixels in the
mask corresponding to filled pixels in the image are set to 1 or to the a value specified in flags
as described below. It is therefore possible to use the same mask in multiple calls to the function
to make sure the filled areas do not overlap.
@param seedPoint Starting point.
@param newVal New value of the repainted domain pixels.
@param loDiff Maximal lower brightness/color difference between the currently observed pixel and
one of its neighbors belonging to the component, or a seed pixel being added to the component.
@param upDiff Maximal upper brightness/color difference between the currently observed pixel and
one of its neighbors belonging to the component, or a seed pixel being added to the component.
@param rect Optional output parameter set by the function to the minimum bounding rectangle of the
repainted domain.
@param flags Operation flags. The first 8 bits contain a connectivity value. The default value of
4 means that only the four nearest neighbor pixels (those that share an edge) are considered. A
connectivity value of 8 means that the eight nearest neighbor pixels (those that share a corner)
will be considered. The next 8 bits (8-16) contain a value between 1 and 255 with which to fill
the mask (the default value is 1). For example, 4 | ( 255 \<\< 8 ) will consider 4 nearest
neighbours and fill the mask with a value of 255. The following additional options occupy higher
bits and therefore may be further combined with the connectivity and mask fill values using
bit-wise or (|), see cv::FloodFillFlags.
<p>
\note Since the mask is larger than the filled image, a pixel \f$(x, y)\f$ in image corresponds to the
pixel \f$(x+1, y+1)\f$ in the mask .
<p>
\sa findContours
 */
@Namespace("cv") public static native int floodFill( @ByVal Mat image, @ByVal Mat mask,
                            @ByVal Point seedPoint, @ByVal Scalar newVal, Rect rect/*=0*/,
                            @ByVal(nullValue = "cv::Scalar()") Scalar loDiff/*=cv::Scalar()*/, @ByVal(nullValue = "cv::Scalar()") Scalar upDiff/*=cv::Scalar()*/,
                            int flags/*=4*/ );
@Namespace("cv") public static native int floodFill( @ByVal Mat image, @ByVal Mat mask,
                            @ByVal Point seedPoint, @ByVal Scalar newVal );

/** \brief Converts an image from one color space to another.
<p>
The function converts an input image from one color space to another. In case of a transformation
to-from RGB color space, the order of the channels should be specified explicitly (RGB or BGR). Note
that the default color format in OpenCV is often referred to as RGB but it is actually BGR (the
bytes are reversed). So the first byte in a standard (24-bit) color image will be an 8-bit Blue
component, the second byte will be Green, and the third byte will be Red. The fourth, fifth, and
sixth bytes would then be the second pixel (Blue, then Green, then Red), and so on.
<p>
The conventional ranges for R, G, and B channel values are:
-   0 to 255 for CV_8U images
-   0 to 65535 for CV_16U images
-   0 to 1 for CV_32F images
<p>
In case of linear transformations, the range does not matter. But in case of a non-linear
transformation, an input RGB image should be normalized to the proper value range to get the correct
results, for example, for RGB \f$\rightarrow\f$ L\*u\*v\* transformation. For example, if you have a
32-bit floating-point image directly converted from an 8-bit image without any scaling, then it will
have the 0..255 value range instead of 0..1 assumed by the function. So, before calling cvtColor ,
you need first to scale the image down:
<pre>{@code
    img *= 1./255;
    cvtColor(img, img, COLOR_BGR2Luv);
}</pre>
If you use cvtColor with 8-bit images, the conversion will have some information lost. For many
applications, this will not be noticeable but it is recommended to use 32-bit images in applications
that need the full range of colors or that convert an image before an operation and then convert
back.
<p>
If conversion adds the alpha channel, its value will set to the maximum of corresponding channel
range: 255 for CV_8U, 65535 for CV_16U, 1 for CV_32F.
<p>
@param src input image: 8-bit unsigned, 16-bit unsigned ( CV_16UC... ), or single-precision
floating-point.
@param dst output image of the same size and depth as src.
@param code color space conversion code (see cv::ColorConversionCodes).
@param dstCn number of channels in the destination image; if the parameter is 0, the number of the
channels is derived automatically from src and code.
<p>
@see \ref imgproc_color_conversions
 */
@Namespace("cv") public static native void cvtColor( @ByVal Mat src, @ByVal Mat dst, int code, int dstCn/*=0*/ );
@Namespace("cv") public static native void cvtColor( @ByVal Mat src, @ByVal Mat dst, int code );

/** \} imgproc_misc */

// main function for all demosaicing procceses
@Namespace("cv") public static native void demosaicing(@ByVal Mat _src, @ByVal Mat _dst, int code, int dcn/*=0*/);
@Namespace("cv") public static native void demosaicing(@ByVal Mat _src, @ByVal Mat _dst, int code);

/** \addtogroup imgproc_shape
 *  \{
<p>
/** \brief Calculates all of the moments up to the third order of a polygon or rasterized shape.
<p>
The function computes moments, up to the 3rd order, of a vector shape or a rasterized shape. The
results are returned in the structure cv::Moments.
<p>
@param array Raster image (single-channel, 8-bit or floating-point 2D array) or an array (
\f$1 \times N\f$ or \f$N \times 1\f$ ) of 2D points (Point or Point2f ).
@param binaryImage If it is true, all non-zero image pixels are treated as 1's. The parameter is
used for images only.
@return moments.
<p>
\sa  contourArea, arcLength
 */
@Namespace("cv") public static native @ByVal Moments moments( @ByVal Mat array, @Cast("bool") boolean binaryImage/*=false*/ );
@Namespace("cv") public static native @ByVal Moments moments( @ByVal Mat array );

/** \brief Calculates seven Hu invariants.
<p>
The function calculates seven Hu invariants (introduced in \cite Hu62; see also
<http://en.wikipedia.org/wiki/Image_moment>) defined as:
<p>
\f[\begin{array}{l} hu[0]= \eta _{20}+ \eta _{02} \\ hu[1]=( \eta _{20}- \eta _{02})^{2}+4 \eta _{11}^{2} \\ hu[2]=( \eta _{30}-3 \eta _{12})^{2}+ (3 \eta _{21}- \eta _{03})^{2} \\ hu[3]=( \eta _{30}+ \eta _{12})^{2}+ ( \eta _{21}+ \eta _{03})^{2} \\ hu[4]=( \eta _{30}-3 \eta _{12})( \eta _{30}+ \eta _{12})[( \eta _{30}+ \eta _{12})^{2}-3( \eta _{21}+ \eta _{03})^{2}]+(3 \eta _{21}- \eta _{03})( \eta _{21}+ \eta _{03})[3( \eta _{30}+ \eta _{12})^{2}-( \eta _{21}+ \eta _{03})^{2}] \\ hu[5]=( \eta _{20}- \eta _{02})[( \eta _{30}+ \eta _{12})^{2}- ( \eta _{21}+ \eta _{03})^{2}]+4 \eta _{11}( \eta _{30}+ \eta _{12})( \eta _{21}+ \eta _{03}) \\ hu[6]=(3 \eta _{21}- \eta _{03})( \eta _{21}+ \eta _{03})[3( \eta _{30}+ \eta _{12})^{2}-( \eta _{21}+ \eta _{03})^{2}]-( \eta _{30}-3 \eta _{12})( \eta _{21}+ \eta _{03})[3( \eta _{30}+ \eta _{12})^{2}-( \eta _{21}+ \eta _{03})^{2}] \\ \end{array}\f]
<p>
where \f$\eta_{ji}\f$ stands for \f$\texttt{Moments::nu}_{ji}\f$ .
<p>
These values are proved to be invariants to the image scale, rotation, and reflection except the
seventh one, whose sign is changed by reflection. This invariance is proved with the assumption of
infinite image resolution. In case of raster images, the computed Hu invariants for the original and
transformed images are a bit different.
<p>
@param moments Input moments computed with moments .
@param hu Output Hu invariants.
<p>
\sa matchShapes
 */
@Namespace("cv") public static native void HuMoments( @Const @ByRef Moments moments, DoublePointer hu );
@Namespace("cv") public static native void HuMoments( @Const @ByRef Moments moments, DoubleBuffer hu );
@Namespace("cv") public static native void HuMoments( @Const @ByRef Moments moments, double[] hu );

/** \overload */
@Namespace("cv") public static native void HuMoments( @Const @ByRef Moments m, @ByVal Mat hu );

/** \} imgproc_shape
 <p>
 *  \addtogroup imgproc_object
 *  \{
 <p>
 *  type of the template matching operation */
/** enum cv::TemplateMatchModes */
public static final int
    /** \f[R(x,y)= \sum _{x',y'} (T(x',y')-I(x+x',y+y'))^2\f] */
    TM_SQDIFF        = 0,
    /** \f[R(x,y)= \frac{\sum_{x',y'} (T(x',y')-I(x+x',y+y'))^2}{\sqrt{\sum_{x',y'}T(x',y')^2 \cdot \sum_{x',y'} I(x+x',y+y')^2}}\f] */
    TM_SQDIFF_NORMED = 1,
    /** \f[R(x,y)= \sum _{x',y'} (T(x',y')  \cdot I(x+x',y+y'))\f] */
    TM_CCORR         = 2,
    /** \f[R(x,y)= \frac{\sum_{x',y'} (T(x',y') \cdot I(x+x',y+y'))}{\sqrt{\sum_{x',y'}T(x',y')^2 \cdot \sum_{x',y'} I(x+x',y+y')^2}}\f] */
    TM_CCORR_NORMED  = 3,
    /** \f[R(x,y)= \sum _{x',y'} (T'(x',y')  \cdot I'(x+x',y+y'))\f]
 *  where
 *  \f[\begin{array}{l} T'(x',y')=T(x',y') - 1/(w  \cdot h)  \cdot \sum _{x'',y''} T(x'',y'') \\ I'(x+x',y+y')=I(x+x',y+y') - 1/(w  \cdot h)  \cdot \sum _{x'',y''} I(x+x'',y+y'') \end{array}\f] */
    TM_CCOEFF        = 4,
    /** \f[R(x,y)= \frac{ \sum_{x',y'} (T'(x',y') \cdot I'(x+x',y+y')) }{ \sqrt{\sum_{x',y'}T'(x',y')^2 \cdot \sum_{x',y'} I'(x+x',y+y')^2} }\f] */
    TM_CCOEFF_NORMED = 5;

/** \brief Compares a template against overlapped image regions.
<p>
The function slides through image , compares the overlapped patches of size \f$w \times h\f$ against
templ using the specified method and stores the comparison results in result . Here are the formulae
for the available comparison methods ( \f$I\f$ denotes image, \f$T\f$ template, \f$R\f$ result ). The summation
is done over template and/or the image patch: \f$x' = 0...w-1, y' = 0...h-1\f$
<p>
After the function finishes the comparison, the best matches can be found as global minimums (when
TM_SQDIFF was used) or maximums (when TM_CCORR or TM_CCOEFF was used) using the
minMaxLoc function. In case of a color image, template summation in the numerator and each sum in
the denominator is done over all of the channels and separate mean values are used for each channel.
That is, the function can take a color template and a color image. The result will still be a
single-channel image, which is easier to analyze.
<p>
@param image Image where the search is running. It must be 8-bit or 32-bit floating-point.
@param templ Searched template. It must be not greater than the source image and have the same
data type.
@param result Map of comparison results. It must be single-channel 32-bit floating-point. If image
is \f$W \times H\f$ and templ is \f$w \times h\f$ , then result is \f$(W-w+1) \times (H-h+1)\f$ .
@param method Parameter specifying the comparison method, see cv::TemplateMatchModes
@param mask Mask of searched template. It must have the same datatype and size with templ. It is
not set by default.
 */
@Namespace("cv") public static native void matchTemplate( @ByVal Mat image, @ByVal Mat templ,
                                 @ByVal Mat result, int method, @ByVal(nullValue = "cv::noArray()") Mat mask/*=cv::noArray()*/ );
@Namespace("cv") public static native void matchTemplate( @ByVal Mat image, @ByVal Mat templ,
                                 @ByVal Mat result, int method );

/** \}
 <p>
 *  \addtogroup imgproc_shape
 *  \{
<p>
/** \brief computes the connected components labeled image of boolean image
<p>
image with 4 or 8 way connectivity - returns N, the total number of labels [0, N-1] where 0
represents the background label. ltype specifies the output label image type, an important
consideration based on the total number of labels or alternatively the total number of pixels in
the source image.
<p>
@param image the 8-bit single-channel image to be labeled
@param labels destination labeled image
@param connectivity 8 or 4 for 8-way or 4-way connectivity respectively
@param ltype output image label type. Currently CV_32S and CV_16U are supported.
 */
@Namespace("cv") public static native int connectedComponents(@ByVal Mat image, @ByVal Mat labels,
                                     int connectivity/*=8*/, int ltype/*=CV_32S*/);
@Namespace("cv") public static native int connectedComponents(@ByVal Mat image, @ByVal Mat labels);

/** \overload
@param image the 8-bit single-channel image to be labeled
@param labels destination labeled image
@param stats statistics output for each label, including the background label, see below for
available statistics. Statistics are accessed via stats(label, COLUMN) where COLUMN is one of
cv::ConnectedComponentsTypes. The data type is CV_32S.
@param centroids centroid output for each label, including the background label. Centroids are
accessed via centroids(label, 0) for x and centroids(label, 1) for y. The data type CV_64F.
@param connectivity 8 or 4 for 8-way or 4-way connectivity respectively
@param ltype output image label type. Currently CV_32S and CV_16U are supported.
*/
@Namespace("cv") public static native int connectedComponentsWithStats(@ByVal Mat image, @ByVal Mat labels,
                                              @ByVal Mat stats, @ByVal Mat centroids,
                                              int connectivity/*=8*/, int ltype/*=CV_32S*/);
@Namespace("cv") public static native int connectedComponentsWithStats(@ByVal Mat image, @ByVal Mat labels,
                                              @ByVal Mat stats, @ByVal Mat centroids);


/** \brief Finds contours in a binary image.
<p>
The function retrieves contours from the binary image using the algorithm \cite Suzuki85 . The contours
are a useful tool for shape analysis and object detection and recognition. See squares.c in the
OpenCV sample directory.
<p>
\note Source image is modified by this function. Also, the function does not take into account
1-pixel border of the image (it's filled with 0's and used for neighbor analysis in the algorithm),
therefore the contours touching the image border will be clipped.
<p>
@param image Source, an 8-bit single-channel image. Non-zero pixels are treated as 1's. Zero
pixels remain 0's, so the image is treated as binary . You can use compare , inRange , threshold ,
adaptiveThreshold , Canny , and others to create a binary image out of a grayscale or color one.
The function modifies the image while extracting the contours. If mode equals to RETR_CCOMP
or RETR_FLOODFILL, the input can also be a 32-bit integer image of labels (CV_32SC1).
@param contours Detected contours. Each contour is stored as a vector of points.
@param hierarchy Optional output vector, containing information about the image topology. It has
as many elements as the number of contours. For each i-th contour contours[i] , the elements
hierarchy[i][0] , hiearchy[i][1] , hiearchy[i][2] , and hiearchy[i][3] are set to 0-based indices
in contours of the next and previous contours at the same hierarchical level, the first child
contour and the parent contour, respectively. If for the contour i there are no next, previous,
parent, or nested contours, the corresponding elements of hierarchy[i] will be negative.
@param mode Contour retrieval mode, see cv::RetrievalModes
@param method Contour approximation method, see cv::ContourApproximationModes
@param offset Optional offset by which every contour point is shifted. This is useful if the
contours are extracted from the image ROI and then they should be analyzed in the whole image
context.
 */
@Namespace("cv") public static native void findContours( @ByVal Mat image, @ByVal MatVector contours,
                              @ByVal Mat hierarchy, int mode,
                              int method, @ByVal(nullValue = "cv::Point()") Point offset/*=cv::Point()*/);
@Namespace("cv") public static native void findContours( @ByVal Mat image, @ByVal MatVector contours,
                              @ByVal Mat hierarchy, int mode,
                              int method);

/** \overload */
@Namespace("cv") public static native void findContours( @ByVal Mat image, @ByVal MatVector contours,
                              int mode, int method, @ByVal(nullValue = "cv::Point()") Point offset/*=cv::Point()*/);
@Namespace("cv") public static native void findContours( @ByVal Mat image, @ByVal MatVector contours,
                              int mode, int method);

/** \brief Approximates a polygonal curve(s) with the specified precision.
<p>
The functions approxPolyDP approximate a curve or a polygon with another curve/polygon with less
vertices so that the distance between them is less or equal to the specified precision. It uses the
Douglas-Peucker algorithm <http://en.wikipedia.org/wiki/Ramer-Douglas-Peucker_algorithm>
<p>
@param curve Input vector of a 2D point stored in std::vector or Mat
@param approxCurve Result of the approximation. The type should match the type of the input curve.
@param epsilon Parameter specifying the approximation accuracy. This is the maximum distance
between the original curve and its approximation.
@param closed If true, the approximated curve is closed (its first and last vertices are
connected). Otherwise, it is not closed.
 */
@Namespace("cv") public static native void approxPolyDP( @ByVal Mat curve,
                                @ByVal Mat approxCurve,
                                double epsilon, @Cast("bool") boolean closed );

/** \brief Calculates a contour perimeter or a curve length.
<p>
The function computes a curve length or a closed contour perimeter.
<p>
@param curve Input vector of 2D points, stored in std::vector or Mat.
@param closed Flag indicating whether the curve is closed or not.
 */
@Namespace("cv") public static native double arcLength( @ByVal Mat curve, @Cast("bool") boolean closed );

/** \brief Calculates the up-right bounding rectangle of a point set.
<p>
The function calculates and returns the minimal up-right bounding rectangle for the specified point set.
<p>
@param points Input 2D point set, stored in std::vector or Mat.
 */
@Namespace("cv") public static native @ByVal Rect boundingRect( @ByVal Mat points );

/** \brief Calculates a contour area.
<p>
The function computes a contour area. Similarly to moments , the area is computed using the Green
formula. Thus, the returned area and the number of non-zero pixels, if you draw the contour using
drawContours or fillPoly , can be different. Also, the function will most certainly give a wrong
results for contours with self-intersections.
<p>
Example:
<pre>{@code
    vector<Point> contour;
    contour.push_back(Point2f(0, 0));
    contour.push_back(Point2f(10, 0));
    contour.push_back(Point2f(10, 10));
    contour.push_back(Point2f(5, 4));

    double area0 = contourArea(contour);
    vector<Point> approx;
    approxPolyDP(contour, approx, 5, true);
    double area1 = contourArea(approx);

    cout << "area0 =" << area0 << endl <<
            "area1 =" << area1 << endl <<
            "approx poly vertices" << approx.size() << endl;
}</pre>
@param contour Input vector of 2D points (contour vertices), stored in std::vector or Mat.
@param oriented Oriented area flag. If it is true, the function returns a signed area value,
depending on the contour orientation (clockwise or counter-clockwise). Using this feature you can
determine orientation of a contour by taking the sign of an area. By default, the parameter is
false, which means that the absolute value is returned.
 */
@Namespace("cv") public static native double contourArea( @ByVal Mat contour, @Cast("bool") boolean oriented/*=false*/ );
@Namespace("cv") public static native double contourArea( @ByVal Mat contour );

/** \brief Finds a rotated rectangle of the minimum area enclosing the input 2D point set.
<p>
The function calculates and returns the minimum-area bounding rectangle (possibly rotated) for a
specified point set. See the OpenCV sample minarea.cpp . Developer should keep in mind that the
returned rotatedRect can contain negative indices when data is close to the containing Mat element
boundary.
<p>
@param points Input vector of 2D points, stored in std::vector\<\> or Mat
 */
@Namespace("cv") public static native @ByVal RotatedRect minAreaRect( @ByVal Mat points );

/** \brief Finds the four vertices of a rotated rect. Useful to draw the rotated rectangle.
<p>
The function finds the four vertices of a rotated rectangle. This function is useful to draw the
rectangle. In C++, instead of using this function, you can directly use box.points() method. Please
visit the [tutorial on bounding
rectangle](http://docs.opencv.org/doc/tutorials/imgproc/shapedescriptors/bounding_rects_circles/bounding_rects_circles.html#bounding-rects-circles)
for more information.
<p>
@param box The input rotated rectangle. It may be the output of
@param points The output array of four vertices of rectangles.
 */
@Namespace("cv") public static native void boxPoints(@ByVal RotatedRect box, @ByVal Mat points);

/** \brief Finds a circle of the minimum area enclosing a 2D point set.
<p>
The function finds the minimal enclosing circle of a 2D point set using an iterative algorithm. See
the OpenCV sample minarea.cpp .
<p>
@param points Input vector of 2D points, stored in std::vector\<\> or Mat
@param center Output center of the circle.
@param radius Output radius of the circle.
 */
@Namespace("cv") public static native void minEnclosingCircle( @ByVal Mat points,
                                      @ByRef Point2f center, @ByRef FloatPointer radius );
@Namespace("cv") public static native void minEnclosingCircle( @ByVal Mat points,
                                      @ByRef Point2f center, @ByRef FloatBuffer radius );
@Namespace("cv") public static native void minEnclosingCircle( @ByVal Mat points,
                                      @ByRef Point2f center, @ByRef float[] radius );

/** \example minarea.cpp
  */

/** \brief Finds a triangle of minimum area enclosing a 2D point set and returns its area.
<p>
The function finds a triangle of minimum area enclosing the given set of 2D points and returns its
area. The output for a given 2D point set is shown in the image below. 2D points are depicted in
*red* and the enclosing triangle in *yellow*.
<p>
![Sample output of the minimum enclosing triangle function](pics/minenclosingtriangle.png)
<p>
The implementation of the algorithm is based on O'Rourke's \cite ORourke86 and Klee and Laskowski's
\cite KleeLaskowski85 papers. O'Rourke provides a \f$\theta(n)\f$ algorithm for finding the minimal
enclosing triangle of a 2D convex polygon with n vertices. Since the minEnclosingTriangle function
takes a 2D point set as input an additional preprocessing step of computing the convex hull of the
2D point set is required. The complexity of the convexHull function is \f$O(n log(n))\f$ which is higher
than \f$\theta(n)\f$. Thus the overall complexity of the function is \f$O(n log(n))\f$.
<p>
@param points Input vector of 2D points with depth CV_32S or CV_32F, stored in std::vector\<\> or Mat
@param triangle Output vector of three 2D points defining the vertices of the triangle. The depth
of the OutputArray must be CV_32F.
 */
@Namespace("cv") public static native double minEnclosingTriangle( @ByVal Mat points, @ByVal Mat triangle );

/** \brief Compares two shapes.
<p>
The function compares two shapes. All three implemented methods use the Hu invariants (see cv::HuMoments)
<p>
@param contour1 First contour or grayscale image.
@param contour2 Second contour or grayscale image.
@param method Comparison method, see ::ShapeMatchModes
@param parameter Method-specific parameter (not supported now).
 */
@Namespace("cv") public static native double matchShapes( @ByVal Mat contour1, @ByVal Mat contour2,
                                 int method, double parameter );

/** \example convexhull.cpp
An example using the convexHull functionality
*/

/** \brief Finds the convex hull of a point set.
<p>
The functions find the convex hull of a 2D point set using the Sklansky's algorithm \cite Sklansky82
that has *O(N logN)* complexity in the current implementation. See the OpenCV sample convexhull.cpp
that demonstrates the usage of different function variants.
<p>
@param points Input 2D point set, stored in std::vector or Mat.
@param hull Output convex hull. It is either an integer vector of indices or vector of points. In
the first case, the hull elements are 0-based indices of the convex hull points in the original
array (since the set of convex hull points is a subset of the original point set). In the second
case, hull elements are the convex hull points themselves.
@param clockwise Orientation flag. If it is true, the output convex hull is oriented clockwise.
Otherwise, it is oriented counter-clockwise. The assumed coordinate system has its X axis pointing
to the right, and its Y axis pointing upwards.
@param returnPoints Operation flag. In case of a matrix, when the flag is true, the function
returns convex hull points. Otherwise, it returns indices of the convex hull points. When the
output array is std::vector, the flag is ignored, and the output depends on the type of the
vector: std::vector\<int\> implies returnPoints=true, std::vector\<Point\> implies
returnPoints=false.
 */
@Namespace("cv") public static native void convexHull( @ByVal Mat points, @ByVal Mat hull,
                              @Cast("bool") boolean clockwise/*=false*/, @Cast("bool") boolean returnPoints/*=true*/ );
@Namespace("cv") public static native void convexHull( @ByVal Mat points, @ByVal Mat hull );

/** \brief Finds the convexity defects of a contour.
<p>
The figure below displays convexity defects of a hand contour:
<p>
![image](pics/defects.png)
<p>
@param contour Input contour.
@param convexhull Convex hull obtained using convexHull that should contain indices of the contour
points that make the hull.
@param convexityDefects The output vector of convexity defects. In C++ and the new Python/Java
interface each convexity defect is represented as 4-element integer vector (a.k.a. cv::Vec4i):
(start_index, end_index, farthest_pt_index, fixpt_depth), where indices are 0-based indices
in the original contour of the convexity defect beginning, end and the farthest point, and
fixpt_depth is fixed-point approximation (with 8 fractional bits) of the distance between the
farthest contour point and the hull. That is, to get the floating-point value of the depth will be
fixpt_depth/256.0.
 */
@Namespace("cv") public static native void convexityDefects( @ByVal Mat contour, @ByVal Mat convexhull, @ByVal Mat convexityDefects );

/** \brief Tests a contour convexity.
<p>
The function tests whether the input contour is convex or not. The contour must be simple, that is,
without self-intersections. Otherwise, the function output is undefined.
<p>
@param contour Input vector of 2D points, stored in std::vector\<\> or Mat
 */
@Namespace("cv") public static native @Cast("bool") boolean isContourConvex( @ByVal Mat contour );

/** finds intersection of two convex polygons */
@Namespace("cv") public static native float intersectConvexConvex( @ByVal Mat _p1, @ByVal Mat _p2,
                                          @ByVal Mat _p12, @Cast("bool") boolean handleNested/*=true*/ );
@Namespace("cv") public static native float intersectConvexConvex( @ByVal Mat _p1, @ByVal Mat _p2,
                                          @ByVal Mat _p12 );

/** \example fitellipse.cpp
  An example using the fitEllipse technique
*/

/** \brief Fits an ellipse around a set of 2D points.
<p>
The function calculates the ellipse that fits (in a least-squares sense) a set of 2D points best of
all. It returns the rotated rectangle in which the ellipse is inscribed. The first algorithm described by \cite Fitzgibbon95
is used. Developer should keep in mind that it is possible that the returned
ellipse/rotatedRect data contains negative indices, due to the data points being close to the
border of the containing Mat element.
<p>
@param points Input 2D point set, stored in std::vector\<\> or Mat
 */
@Namespace("cv") public static native @ByVal RotatedRect fitEllipse( @ByVal Mat points );

/** \brief Fits a line to a 2D or 3D point set.
<p>
The function fitLine fits a line to a 2D or 3D point set by minimizing \f$\sum_i \rho(r_i)\f$ where
\f$r_i\f$ is a distance between the \f$i^{th}\f$ point, the line and \f$\rho(r)\f$ is a distance function, one
of the following:
-  DIST_L2
\f[\rho (r) = r^2/2  \quad \text{(the simplest and the fastest least-squares method)}\f]
- DIST_L1
\f[\rho (r) = r\f]
- DIST_L12
\f[\rho (r) = 2  \cdot ( \sqrt{1 + \frac{r^2}{2}} - 1)\f]
- DIST_FAIR
\f[\rho \left (r \right ) = C^2  \cdot \left (  \frac{r}{C} -  \log{\left(1 + \frac{r}{C}\right)} \right )  \quad \text{where} \quad C=1.3998\f]
- DIST_WELSCH
\f[\rho \left (r \right ) =  \frac{C^2}{2} \cdot \left ( 1 -  \exp{\left(-\left(\frac{r}{C}\right)^2\right)} \right )  \quad \text{where} \quad C=2.9846\f]
- DIST_HUBER
\f[\rho (r) =  \fork{r^2/2}{if \(r < C\)}{C \cdot (r-C/2)}{otherwise} \quad \text{where} \quad C=1.345\f]
<p>
The algorithm is based on the M-estimator ( <http://en.wikipedia.org/wiki/M-estimator> ) technique
that iteratively fits the line using the weighted least-squares algorithm. After each iteration the
weights \f$w_i\f$ are adjusted to be inversely proportional to \f$\rho(r_i)\f$ .
<p>
@param points Input vector of 2D or 3D points, stored in std::vector\<\> or Mat.
@param line Output line parameters. In case of 2D fitting, it should be a vector of 4 elements
(like Vec4f) - (vx, vy, x0, y0), where (vx, vy) is a normalized vector collinear to the line and
(x0, y0) is a point on the line. In case of 3D fitting, it should be a vector of 6 elements (like
Vec6f) - (vx, vy, vz, x0, y0, z0), where (vx, vy, vz) is a normalized vector collinear to the line
and (x0, y0, z0) is a point on the line.
@param distType Distance used by the M-estimator, see cv::DistanceTypes
@param param Numerical parameter ( C ) for some types of distances. If it is 0, an optimal value
is chosen.
@param reps Sufficient accuracy for the radius (distance between the coordinate origin and the line).
@param aeps Sufficient accuracy for the angle. 0.01 would be a good default value for reps and aeps.
 */
@Namespace("cv") public static native void fitLine( @ByVal Mat points, @ByVal Mat line, int distType,
                           double param, double reps, double aeps );

/** \brief Performs a point-in-contour test.
<p>
The function determines whether the point is inside a contour, outside, or lies on an edge (or
coincides with a vertex). It returns positive (inside), negative (outside), or zero (on an edge)
value, correspondingly. When measureDist=false , the return value is +1, -1, and 0, respectively.
Otherwise, the return value is a signed distance between the point and the nearest contour edge.
<p>
See below a sample output of the function where each image pixel is tested against the contour:
<p>
![sample output](pics/pointpolygon.png)
<p>
@param contour Input contour.
@param pt Point tested against the contour.
@param measureDist If true, the function estimates the signed distance from the point to the
nearest contour edge. Otherwise, the function only checks if the point is inside a contour or not.
 */
@Namespace("cv") public static native double pointPolygonTest( @ByVal Mat contour, @ByVal Point2f pt, @Cast("bool") boolean measureDist );

/** \brief Finds out if there is any intersection between two rotated rectangles.
<p>
If there is then the vertices of the interesecting region are returned as well.
<p>
Below are some examples of intersection configurations. The hatched pattern indicates the
intersecting region and the red vertices are returned by the function.
<p>
![intersection examples](pics/intersection.png)
<p>
@param rect1 First rectangle
@param rect2 Second rectangle
@param intersectingRegion The output array of the verticies of the intersecting region. It returns
at most 8 vertices. Stored as std::vector\<cv::Point2f\> or cv::Mat as Mx1 of type CV_32FC2.
@return One of cv::RectanglesIntersectTypes
 */
@Namespace("cv") public static native int rotatedRectangleIntersection( @Const @ByRef RotatedRect rect1, @Const @ByRef RotatedRect rect2, @ByVal Mat intersectingRegion  );

/** \} imgproc_shape */

@Namespace("cv") public static native @Ptr CLAHE createCLAHE(double clipLimit/*=40.0*/, @ByVal(nullValue = "cv::Size(8, 8)") Size tileGridSize/*=cv::Size(8, 8)*/);
@Namespace("cv") public static native @Ptr CLAHE createCLAHE();

/** Ballard, D.H. (1981). Generalizing the Hough transform to detect arbitrary shapes. Pattern Recognition 13 (2): 111-122.
 *  Detects position only without traslation and rotation */
@Namespace("cv") public static native @Ptr GeneralizedHoughBallard createGeneralizedHoughBallard();

/** Guil, N., González-Linares, J.M. and Zapata, E.L. (1999). Bidimensional shape detection using an invariant approach. Pattern Recognition 32 (6): 1025-1038.
 *  Detects position, traslation and rotation */
@Namespace("cv") public static native @Ptr GeneralizedHoughGuil createGeneralizedHoughGuil();

/** Performs linear blending of two images */
@Namespace("cv") public static native void blendLinear(@ByVal Mat src1, @ByVal Mat src2, @ByVal Mat weights1, @ByVal Mat weights2, @ByVal Mat dst);

/** \addtogroup imgproc_colormap
 *  \{
 <p>
 *  GNU Octave/MATLAB equivalent colormaps */
/** enum cv::ColormapTypes */
public static final int
    /** ![autumn](pics/colormaps/colorscale_autumn.jpg) */
    COLORMAP_AUTUMN = 0,
    /** ![bone](pics/colormaps/colorscale_bone.jpg) */
    COLORMAP_BONE = 1,
    /** ![jet](pics/colormaps/colorscale_jet.jpg) */
    COLORMAP_JET = 2,
    /** ![winter](pics/colormaps/colorscale_winter.jpg) */
    COLORMAP_WINTER = 3,
    /** ![rainbow](pics/colormaps/colorscale_rainbow.jpg) */
    COLORMAP_RAINBOW = 4,
    /** ![ocean](pics/colormaps/colorscale_ocean.jpg) */
    COLORMAP_OCEAN = 5,
    /** ![summer](pics/colormaps/colorscale_summer.jpg) */
    COLORMAP_SUMMER = 6,
    /** ![spring](pics/colormaps/colorscale_spring.jpg) */
    COLORMAP_SPRING = 7,
    /** ![cool](pics/colormaps/colorscale_cool.jpg) */
    COLORMAP_COOL = 8,
    /** ![HSV](pics/colormaps/colorscale_hsv.jpg) */
    COLORMAP_HSV = 9,
    /** ![pink](pics/colormaps/colorscale_pink.jpg) */
    COLORMAP_PINK = 10,
    /** ![hot](pics/colormaps/colorscale_hot.jpg) */
    COLORMAP_HOT = 11,
    /** ![parula](pics/colormaps/colorscale_parula.jpg) */
    COLORMAP_PARULA = 12;

/** \brief Applies a GNU Octave/MATLAB equivalent colormap on a given image.
<p>
@param src The source image, grayscale or colored does not matter.
@param dst The result is the colormapped source image. Note: Mat::create is called on dst.
@param colormap The colormap to apply, see cv::ColormapTypes
 */
@Namespace("cv") public static native void applyColorMap(@ByVal Mat src, @ByVal Mat dst, int colormap);

/** \} imgproc_colormap
 <p>
 *  \addtogroup imgproc_draw
 *  \{
<p>
/** \brief Draws a line segment connecting two points.
<p>
The function line draws the line segment between pt1 and pt2 points in the image. The line is
clipped by the image boundaries. For non-antialiased lines with integer coordinates, the 8-connected
or 4-connected Bresenham algorithm is used. Thick lines are drawn with rounding endings. Antialiased
lines are drawn using Gaussian filtering.
<p>
@param img Image.
@param pt1 First point of the line segment.
@param pt2 Second point of the line segment.
@param color Line color.
@param thickness Line thickness.
@param lineType Type of the line, see cv::LineTypes.
@param shift Number of fractional bits in the point coordinates.
 */
@Namespace("cv") public static native void line(@ByVal Mat img, @ByVal Point pt1, @ByVal Point pt2, @Const @ByRef Scalar color,
                     int thickness/*=1*/, int lineType/*=cv::LINE_8*/, int shift/*=0*/);
@Namespace("cv") public static native void line(@ByVal Mat img, @ByVal Point pt1, @ByVal Point pt2, @Const @ByRef Scalar color);

/** \brief Draws a arrow segment pointing from the first point to the second one.
<p>
The function arrowedLine draws an arrow between pt1 and pt2 points in the image. See also cv::line.
<p>
@param img Image.
@param pt1 The point the arrow starts from.
@param pt2 The point the arrow points to.
@param color Line color.
@param thickness Line thickness.
@param line_type Type of the line, see cv::LineTypes
@param shift Number of fractional bits in the point coordinates.
@param tipLength The length of the arrow tip in relation to the arrow length
 */
@Namespace("cv") public static native void arrowedLine(@ByVal Mat img, @ByVal Point pt1, @ByVal Point pt2, @Const @ByRef Scalar color,
                     int thickness/*=1*/, int line_type/*=8*/, int shift/*=0*/, double tipLength/*=0.1*/);
@Namespace("cv") public static native void arrowedLine(@ByVal Mat img, @ByVal Point pt1, @ByVal Point pt2, @Const @ByRef Scalar color);

/** \brief Draws a simple, thick, or filled up-right rectangle.
<p>
The function rectangle draws a rectangle outline or a filled rectangle whose two opposite corners
are pt1 and pt2.
<p>
@param img Image.
@param pt1 Vertex of the rectangle.
@param pt2 Vertex of the rectangle opposite to pt1 .
@param color Rectangle color or brightness (grayscale image).
@param thickness Thickness of lines that make up the rectangle. Negative values, like CV_FILLED ,
mean that the function has to draw a filled rectangle.
@param lineType Type of the line. See the line description.
@param shift Number of fractional bits in the point coordinates.
 */
@Namespace("cv") public static native void rectangle(@ByVal Mat img, @ByVal Point pt1, @ByVal Point pt2,
                          @Const @ByRef Scalar color, int thickness/*=1*/,
                          int lineType/*=cv::LINE_8*/, int shift/*=0*/);
@Namespace("cv") public static native void rectangle(@ByVal Mat img, @ByVal Point pt1, @ByVal Point pt2,
                          @Const @ByRef Scalar color);

/** \overload
<p>
use {@code rec} parameter as alternative specification of the drawn rectangle: {@code r.tl() and
r.br()-Point(1,1)} are opposite corners
*/
@Namespace("cv") public static native void rectangle(@ByRef Mat img, @ByVal Rect rec,
                          @Const @ByRef Scalar color, int thickness/*=1*/,
                          int lineType/*=cv::LINE_8*/, int shift/*=0*/);
@Namespace("cv") public static native void rectangle(@ByRef Mat img, @ByVal Rect rec,
                          @Const @ByRef Scalar color);

/** \brief Draws a circle.
<p>
The function circle draws a simple or filled circle with a given center and radius.
@param img Image where the circle is drawn.
@param center Center of the circle.
@param radius Radius of the circle.
@param color Circle color.
@param thickness Thickness of the circle outline, if positive. Negative thickness means that a
filled circle is to be drawn.
@param lineType Type of the circle boundary. See the line description.
@param shift Number of fractional bits in the coordinates of the center and in the radius value.
 */
@Namespace("cv") public static native void circle(@ByVal Mat img, @ByVal Point center, int radius,
                       @Const @ByRef Scalar color, int thickness/*=1*/,
                       int lineType/*=cv::LINE_8*/, int shift/*=0*/);
@Namespace("cv") public static native void circle(@ByVal Mat img, @ByVal Point center, int radius,
                       @Const @ByRef Scalar color);

/** \brief Draws a simple or thick elliptic arc or fills an ellipse sector.
<p>
The functions ellipse with less parameters draw an ellipse outline, a filled ellipse, an elliptic
arc, or a filled ellipse sector. A piecewise-linear curve is used to approximate the elliptic arc
boundary. If you need more control of the ellipse rendering, you can retrieve the curve using
ellipse2Poly and then render it with polylines or fill it with fillPoly . If you use the first
variant of the function and want to draw the whole ellipse, not an arc, pass startAngle=0 and
endAngle=360 . The figure below explains the meaning of the parameters.
<p>
![Parameters of Elliptic Arc](pics/ellipse.png)
<p>
@param img Image.
@param center Center of the ellipse.
@param axes Half of the size of the ellipse main axes.
@param angle Ellipse rotation angle in degrees.
@param startAngle Starting angle of the elliptic arc in degrees.
@param endAngle Ending angle of the elliptic arc in degrees.
@param color Ellipse color.
@param thickness Thickness of the ellipse arc outline, if positive. Otherwise, this indicates that
a filled ellipse sector is to be drawn.
@param lineType Type of the ellipse boundary. See the line description.
@param shift Number of fractional bits in the coordinates of the center and values of axes.
 */
@Namespace("cv") public static native void ellipse(@ByVal Mat img, @ByVal Point center, @ByVal Size axes,
                        double angle, double startAngle, double endAngle,
                        @Const @ByRef Scalar color, int thickness/*=1*/,
                        int lineType/*=cv::LINE_8*/, int shift/*=0*/);
@Namespace("cv") public static native void ellipse(@ByVal Mat img, @ByVal Point center, @ByVal Size axes,
                        double angle, double startAngle, double endAngle,
                        @Const @ByRef Scalar color);

/** \overload
@param img Image.
@param box Alternative ellipse representation via RotatedRect. This means that the function draws
an ellipse inscribed in the rotated rectangle.
@param color Ellipse color.
@param thickness Thickness of the ellipse arc outline, if positive. Otherwise, this indicates that
a filled ellipse sector is to be drawn.
@param lineType Type of the ellipse boundary. See the line description.
*/
@Namespace("cv") public static native void ellipse(@ByVal Mat img, @Const @ByRef RotatedRect box, @Const @ByRef Scalar color,
                        int thickness/*=1*/, int lineType/*=cv::LINE_8*/);
@Namespace("cv") public static native void ellipse(@ByVal Mat img, @Const @ByRef RotatedRect box, @Const @ByRef Scalar color);

/* ----------------------------------------------------------------------------------------- */
/* ADDING A SET OF PREDEFINED MARKERS WHICH COULD BE USED TO HIGHLIGHT POSITIONS IN AN IMAGE */
/* ----------------------------------------------------------------------------------------- */

/** Possible set of marker types used for the cv::drawMarker function */
/** enum cv::MarkerTypes */
public static final int
    /** A crosshair marker shape */
    MARKER_CROSS = 0,
    /** A 45 degree tilted crosshair marker shape */
    MARKER_TILTED_CROSS = 1,
    /** A star marker shape, combination of cross and tilted cross */
    MARKER_STAR = 2,
    /** A diamond marker shape */
    MARKER_DIAMOND = 3,
    /** A square marker shape */
    MARKER_SQUARE = 4,
    /** An upwards pointing triangle marker shape */
    MARKER_TRIANGLE_UP = 5,
    /** A downwards pointing triangle marker shape */
    MARKER_TRIANGLE_DOWN = 6;

/** \brief Draws a marker on a predefined position in an image.
<p>
The function drawMarker draws a marker on a given position in the image. For the moment several
marker types are supported, see cv::MarkerTypes for more information.
<p>
@param img Image.
@param position The point where the crosshair is positioned.
@param markerType The specific type of marker you want to use, see cv::MarkerTypes
@param color Line color.
@param thickness Line thickness.
@param line_type Type of the line, see cv::LineTypes
@param markerSize The length of the marker axis [default = 20 pixels]
 */
@Namespace("cv") public static native void drawMarker(@ByRef Mat img, @ByVal Point position, @Const @ByRef Scalar color,
                             int markerType/*=cv::MARKER_CROSS*/, int markerSize/*=20*/, int thickness/*=1*/,
                             int line_type/*=8*/);
@Namespace("cv") public static native void drawMarker(@ByRef Mat img, @ByVal Point position, @Const @ByRef Scalar color);

/* ----------------------------------------------------------------------------------------- */
/* END OF MARKER SECTION */
/* ----------------------------------------------------------------------------------------- */

/** \overload */
@Namespace("cv") public static native void fillConvexPoly(@ByRef Mat img, @Const Point pts, int npts,
                               @Const @ByRef Scalar color, int lineType/*=cv::LINE_8*/,
                               int shift/*=0*/);
@Namespace("cv") public static native void fillConvexPoly(@ByRef Mat img, @Const Point pts, int npts,
                               @Const @ByRef Scalar color);

/** \brief Fills a convex polygon.
<p>
The function fillConvexPoly draws a filled convex polygon. This function is much faster than the
function cv::fillPoly . It can fill not only convex polygons but any monotonic polygon without
self-intersections, that is, a polygon whose contour intersects every horizontal line (scan line)
twice at the most (though, its top-most and/or the bottom edge could be horizontal).
<p>
@param img Image.
@param points Polygon vertices.
@param color Polygon color.
@param lineType Type of the polygon boundaries. See the line description.
@param shift Number of fractional bits in the vertex coordinates.
 */
@Namespace("cv") public static native void fillConvexPoly(@ByVal Mat img, @ByVal Mat points,
                                 @Const @ByRef Scalar color, int lineType/*=cv::LINE_8*/,
                                 int shift/*=0*/);
@Namespace("cv") public static native void fillConvexPoly(@ByVal Mat img, @ByVal Mat points,
                                 @Const @ByRef Scalar color);

/** \overload */
@Namespace("cv") public static native void fillPoly(@ByRef Mat img, @Cast("const cv::Point**") PointerPointer pts,
                         @Const IntPointer npts, int ncontours,
                         @Const @ByRef Scalar color, int lineType/*=cv::LINE_8*/, int shift/*=0*/,
                         @ByVal(nullValue = "cv::Point()") Point offset/*=cv::Point()*/ );
@Namespace("cv") public static native void fillPoly(@ByRef Mat img, @Const @ByPtrPtr Point pts,
                         @Const IntPointer npts, int ncontours,
                         @Const @ByRef Scalar color );
@Namespace("cv") public static native void fillPoly(@ByRef Mat img, @Const @ByPtrPtr Point pts,
                         @Const IntPointer npts, int ncontours,
                         @Const @ByRef Scalar color, int lineType/*=cv::LINE_8*/, int shift/*=0*/,
                         @ByVal(nullValue = "cv::Point()") Point offset/*=cv::Point()*/ );
@Namespace("cv") public static native void fillPoly(@ByRef Mat img, @Const @ByPtrPtr Point pts,
                         @Const IntBuffer npts, int ncontours,
                         @Const @ByRef Scalar color, int lineType/*=cv::LINE_8*/, int shift/*=0*/,
                         @ByVal(nullValue = "cv::Point()") Point offset/*=cv::Point()*/ );
@Namespace("cv") public static native void fillPoly(@ByRef Mat img, @Const @ByPtrPtr Point pts,
                         @Const IntBuffer npts, int ncontours,
                         @Const @ByRef Scalar color );
@Namespace("cv") public static native void fillPoly(@ByRef Mat img, @Const @ByPtrPtr Point pts,
                         @Const int[] npts, int ncontours,
                         @Const @ByRef Scalar color, int lineType/*=cv::LINE_8*/, int shift/*=0*/,
                         @ByVal(nullValue = "cv::Point()") Point offset/*=cv::Point()*/ );
@Namespace("cv") public static native void fillPoly(@ByRef Mat img, @Const @ByPtrPtr Point pts,
                         @Const int[] npts, int ncontours,
                         @Const @ByRef Scalar color );

/** \brief Fills the area bounded by one or more polygons.
<p>
The function fillPoly fills an area bounded by several polygonal contours. The function can fill
complex areas, for example, areas with holes, contours with self-intersections (some of their
parts), and so forth.
<p>
@param img Image.
@param pts Array of polygons where each polygon is represented as an array of points.
@param color Polygon color.
@param lineType Type of the polygon boundaries. See the line description.
@param shift Number of fractional bits in the vertex coordinates.
@param offset Optional offset of all points of the contours.
 */
@Namespace("cv") public static native void fillPoly(@ByVal Mat img, @ByVal MatVector pts,
                           @Const @ByRef Scalar color, int lineType/*=cv::LINE_8*/, int shift/*=0*/,
                           @ByVal(nullValue = "cv::Point()") Point offset/*=cv::Point()*/ );
@Namespace("cv") public static native void fillPoly(@ByVal Mat img, @ByVal MatVector pts,
                           @Const @ByRef Scalar color );

/** \overload */
@Namespace("cv") public static native void polylines(@ByRef Mat img, @Cast("const cv::Point*const*") PointerPointer pts, @Const IntPointer npts,
                          int ncontours, @Cast("bool") boolean isClosed, @Const @ByRef Scalar color,
                          int thickness/*=1*/, int lineType/*=cv::LINE_8*/, int shift/*=0*/ );
@Namespace("cv") public static native void polylines(@ByRef Mat img, @Const @ByPtrPtr Point pts, @Const IntPointer npts,
                          int ncontours, @Cast("bool") boolean isClosed, @Const @ByRef Scalar color );
@Namespace("cv") public static native void polylines(@ByRef Mat img, @Const @ByPtrPtr Point pts, @Const IntPointer npts,
                          int ncontours, @Cast("bool") boolean isClosed, @Const @ByRef Scalar color,
                          int thickness/*=1*/, int lineType/*=cv::LINE_8*/, int shift/*=0*/ );
@Namespace("cv") public static native void polylines(@ByRef Mat img, @Const @ByPtrPtr Point pts, @Const IntBuffer npts,
                          int ncontours, @Cast("bool") boolean isClosed, @Const @ByRef Scalar color,
                          int thickness/*=1*/, int lineType/*=cv::LINE_8*/, int shift/*=0*/ );
@Namespace("cv") public static native void polylines(@ByRef Mat img, @Const @ByPtrPtr Point pts, @Const IntBuffer npts,
                          int ncontours, @Cast("bool") boolean isClosed, @Const @ByRef Scalar color );
@Namespace("cv") public static native void polylines(@ByRef Mat img, @Const @ByPtrPtr Point pts, @Const int[] npts,
                          int ncontours, @Cast("bool") boolean isClosed, @Const @ByRef Scalar color,
                          int thickness/*=1*/, int lineType/*=cv::LINE_8*/, int shift/*=0*/ );
@Namespace("cv") public static native void polylines(@ByRef Mat img, @Const @ByPtrPtr Point pts, @Const int[] npts,
                          int ncontours, @Cast("bool") boolean isClosed, @Const @ByRef Scalar color );

/** \brief Draws several polygonal curves.
<p>
@param img Image.
@param pts Array of polygonal curves.
@param isClosed Flag indicating whether the drawn polylines are closed or not. If they are closed,
the function draws a line from the last vertex of each curve to its first vertex.
@param color Polyline color.
@param thickness Thickness of the polyline edges.
@param lineType Type of the line segments. See the line description.
@param shift Number of fractional bits in the vertex coordinates.
<p>
The function polylines draws one or more polygonal curves.
 */
@Namespace("cv") public static native void polylines(@ByVal Mat img, @ByVal MatVector pts,
                            @Cast("bool") boolean isClosed, @Const @ByRef Scalar color,
                            int thickness/*=1*/, int lineType/*=cv::LINE_8*/, int shift/*=0*/ );
@Namespace("cv") public static native void polylines(@ByVal Mat img, @ByVal MatVector pts,
                            @Cast("bool") boolean isClosed, @Const @ByRef Scalar color );

/** \example contours2.cpp
  An example using the drawContour functionality
*/

/** \example segment_objects.cpp
An example using drawContours to clean up a background segmentation result
 */

/** \brief Draws contours outlines or filled contours.
<p>
The function draws contour outlines in the image if \f$\texttt{thickness} \ge 0\f$ or fills the area
bounded by the contours if \f$\texttt{thickness}<0\f$ . The example below shows how to retrieve
connected components from the binary image and label them: :
<pre>{@code
    #include "opencv2/imgproc.hpp"
    #include "opencv2/highgui.hpp"

    using namespace cv;
    using namespace std;

    int main( int argc, char** argv )
    {
        Mat src;
        // the first command-line parameter must be a filename of the binary
        // (black-n-white) image
        if( argc != 2 || !(src=imread(argv[1], 0)).data)
            return -1;

        Mat dst = Mat::zeros(src.rows, src.cols, CV_8UC3);

        src = src > 1;
        namedWindow( "Source", 1 );
        imshow( "Source", src );

        vector<vector<Point> > contours;
        vector<Vec4i> hierarchy;

        findContours( src, contours, hierarchy,
            RETR_CCOMP, CHAIN_APPROX_SIMPLE );

        // iterate through all the top-level contours,
        // draw each connected component with its own random color
        int idx = 0;
        for( ; idx >= 0; idx = hierarchy[idx][0] )
        {
            Scalar color( rand()&255, rand()&255, rand()&255 );
            drawContours( dst, contours, idx, color, FILLED, 8, hierarchy );
        }

        namedWindow( "Components", 1 );
        imshow( "Components", dst );
        waitKey(0);
    }
}</pre>
<p>
@param image Destination image.
@param contours All the input contours. Each contour is stored as a point vector.
@param contourIdx Parameter indicating a contour to draw. If it is negative, all the contours are drawn.
@param color Color of the contours.
@param thickness Thickness of lines the contours are drawn with. If it is negative (for example,
thickness=CV_FILLED ), the contour interiors are drawn.
@param lineType Line connectivity. See cv::LineTypes.
@param hierarchy Optional information about hierarchy. It is only needed if you want to draw only
some of the contours (see maxLevel ).
@param maxLevel Maximal level for drawn contours. If it is 0, only the specified contour is drawn.
If it is 1, the function draws the contour(s) and all the nested contours. If it is 2, the function
draws the contours, all the nested contours, all the nested-to-nested contours, and so on. This
parameter is only taken into account when there is hierarchy available.
@param offset Optional contour shift parameter. Shift all the drawn contours by the specified
\f$\texttt{offset}=(dx,dy)\f$ .
 */
@Namespace("cv") public static native void drawContours( @ByVal Mat image, @ByVal MatVector contours,
                              int contourIdx, @Const @ByRef Scalar color,
                              int thickness/*=1*/, int lineType/*=cv::LINE_8*/,
                              @ByVal(nullValue = "cv::noArray()") Mat hierarchy/*=cv::noArray()*/,
                              int maxLevel/*=INT_MAX*/, @ByVal(nullValue = "cv::Point()") Point offset/*=cv::Point()*/ );
@Namespace("cv") public static native void drawContours( @ByVal Mat image, @ByVal MatVector contours,
                              int contourIdx, @Const @ByRef Scalar color );

/** \brief Clips the line against the image rectangle.
<p>
The functions clipLine calculate a part of the line segment that is entirely within the specified
rectangle. They return false if the line segment is completely outside the rectangle. Otherwise,
they return true .
@param imgSize Image size. The image rectangle is Rect(0, 0, imgSize.width, imgSize.height) .
@param pt1 First line point.
@param pt2 Second line point.
 */
@Namespace("cv") public static native @Cast("bool") boolean clipLine(@ByVal Size imgSize, @ByRef Point pt1, @ByRef Point pt2);

/** \overload
@param imgRect Image rectangle.
@param pt1 First line point.
@param pt2 Second line point.
*/
@Namespace("cv") public static native @Cast("bool") boolean clipLine(@ByVal Rect imgRect, @ByRef Point pt1, @ByRef Point pt2);

/** \brief Approximates an elliptic arc with a polyline.
<p>
The function ellipse2Poly computes the vertices of a polyline that approximates the specified
elliptic arc. It is used by cv::ellipse.
<p>
@param center Center of the arc.
@param axes Half of the size of the ellipse main axes. See the ellipse for details.
@param angle Rotation angle of the ellipse in degrees. See the ellipse for details.
@param arcStart Starting angle of the elliptic arc in degrees.
@param arcEnd Ending angle of the elliptic arc in degrees.
@param delta Angle between the subsequent polyline vertices. It defines the approximation
accuracy.
@param pts Output vector of polyline vertices.
 */
@Namespace("cv") public static native void ellipse2Poly( @ByVal Point center, @ByVal Size axes, int angle,
                                int arcStart, int arcEnd, int delta,
                                @ByRef PointVector pts );

/** \brief Draws a text string.
<p>
The function putText renders the specified text string in the image. Symbols that cannot be rendered
using the specified font are replaced by question marks. See getTextSize for a text rendering code
example.
<p>
@param img Image.
@param text Text string to be drawn.
@param org Bottom-left corner of the text string in the image.
@param fontFace Font type, see cv::HersheyFonts.
@param fontScale Font scale factor that is multiplied by the font-specific base size.
@param color Text color.
@param thickness Thickness of the lines used to draw a text.
@param lineType Line type. See the line for details.
@param bottomLeftOrigin When true, the image data origin is at the bottom-left corner. Otherwise,
it is at the top-left corner.
 */
@Namespace("cv") public static native void putText( @ByVal Mat img, @Str BytePointer text, @ByVal Point org,
                         int fontFace, double fontScale, @ByVal Scalar color,
                         int thickness/*=1*/, int lineType/*=cv::LINE_8*/,
                         @Cast("bool") boolean bottomLeftOrigin/*=false*/ );
@Namespace("cv") public static native void putText( @ByVal Mat img, @Str BytePointer text, @ByVal Point org,
                         int fontFace, double fontScale, @ByVal Scalar color );
@Namespace("cv") public static native void putText( @ByVal Mat img, @Str String text, @ByVal Point org,
                         int fontFace, double fontScale, @ByVal Scalar color,
                         int thickness/*=1*/, int lineType/*=cv::LINE_8*/,
                         @Cast("bool") boolean bottomLeftOrigin/*=false*/ );
@Namespace("cv") public static native void putText( @ByVal Mat img, @Str String text, @ByVal Point org,
                         int fontFace, double fontScale, @ByVal Scalar color );

/** \brief Calculates the width and height of a text string.
<p>
The function getTextSize calculates and returns the size of a box that contains the specified text.
That is, the following code renders some text, the tight box surrounding it, and the baseline: :
<pre>{@code
    String text = "Funny text inside the box";
    int fontFace = FONT_HERSHEY_SCRIPT_SIMPLEX;
    double fontScale = 2;
    int thickness = 3;

    Mat img(600, 800, CV_8UC3, Scalar::all(0));

    int baseline=0;
    Size textSize = getTextSize(text, fontFace,
                                fontScale, thickness, &baseline);
    baseline += thickness;

    // center the text
    Point textOrg((img.cols - textSize.width)/2,
                  (img.rows + textSize.height)/2);

    // draw the box
    rectangle(img, textOrg + Point(0, baseline),
              textOrg + Point(textSize.width, -textSize.height),
              Scalar(0,0,255));
    // ... and the baseline first
    line(img, textOrg + Point(0, thickness),
         textOrg + Point(textSize.width, thickness),
         Scalar(0, 0, 255));

    // then put the text itself
    putText(img, text, textOrg, fontFace, fontScale,
            Scalar::all(255), thickness, 8);
}</pre>
<p>
@param text Input text string.
@param fontFace Font to use, see cv::HersheyFonts.
@param fontScale Font scale factor that is multiplied by the font-specific base size.
@param thickness Thickness of lines used to render the text. See putText for details.
@param [out] baseLine y-coordinate of the baseline relative to the bottom-most text
point.
@return The size of a box that contains the specified text.
<p>
@see cv::putText
 */
@Namespace("cv") public static native @ByVal Size getTextSize(@Str BytePointer text, int fontFace,
                            double fontScale, int thickness,
                            IntPointer baseLine);
@Namespace("cv") public static native @ByVal Size getTextSize(@Str String text, int fontFace,
                            double fontScale, int thickness,
                            IntBuffer baseLine);
@Namespace("cv") public static native @ByVal Size getTextSize(@Str BytePointer text, int fontFace,
                            double fontScale, int thickness,
                            int[] baseLine);
@Namespace("cv") public static native @ByVal Size getTextSize(@Str String text, int fontFace,
                            double fontScale, int thickness,
                            IntPointer baseLine);
@Namespace("cv") public static native @ByVal Size getTextSize(@Str BytePointer text, int fontFace,
                            double fontScale, int thickness,
                            IntBuffer baseLine);
@Namespace("cv") public static native @ByVal Size getTextSize(@Str String text, int fontFace,
                            double fontScale, int thickness,
                            int[] baseLine);

/** \brief Line iterator
<p>
The class is used to iterate over all the pixels on the raster line
segment connecting two specified points.
<p>
The class LineIterator is used to get each pixel of a raster line. It
can be treated as versatile implementation of the Bresenham algorithm
where you can stop at each pixel and do some extra processing, for
example, grab pixel values along the line or draw a line with an effect
(for example, with XOR operation).
<p>
The number of pixels along the line is stored in LineIterator::count.
The method LineIterator::pos returns the current position in the image:
<p>
<pre>{@code {.cpp}
// grabs pixels along the line (pt1, pt2)
// from 8-bit 3-channel image to the buffer
LineIterator it(img, pt1, pt2, 8);
LineIterator it2 = it;
vector<Vec3b> buf(it.count);

for(int i = 0; i < it.count; i++, ++it)
    buf[i] = *(const Vec3b)*it;

// alternative way of iterating through the line
for(int i = 0; i < it2.count; i++, ++it2)
{
    Vec3b val = img.at<Vec3b>(it2.pos());
    CV_Assert(buf[i] == val);
}
}</pre>
*/
@Namespace("cv") @NoOffset public static class LineIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LineIterator(Pointer p) { super(p); }

    /** \brief intializes the iterator
    <p>
    creates iterators for the line connecting pt1 and pt2
    the line will be clipped on the image boundaries
    the line is 8-connected or 4-connected
    If leftToRight=true, then the iteration is always done
    from the left-most point to the right most,
    not to depend on the ordering of pt1 and pt2 parameters
    */
    public LineIterator( @Const @ByRef Mat img, @ByVal Point pt1, @ByVal Point pt2,
                      int connectivity/*=8*/, @Cast("bool") boolean leftToRight/*=false*/ ) { super((Pointer)null); allocate(img, pt1, pt2, connectivity, leftToRight); }
    private native void allocate( @Const @ByRef Mat img, @ByVal Point pt1, @ByVal Point pt2,
                      int connectivity/*=8*/, @Cast("bool") boolean leftToRight/*=false*/ );
    public LineIterator( @Const @ByRef Mat img, @ByVal Point pt1, @ByVal Point pt2 ) { super((Pointer)null); allocate(img, pt1, pt2); }
    private native void allocate( @Const @ByRef Mat img, @ByVal Point pt1, @ByVal Point pt2 );
    /** \brief returns pointer to the current pixel
    */
    public native @Cast("uchar*") @Name("operator *") BytePointer multiply();
    /** \brief prefix increment operator (++it). shifts iterator to the next pixel
    */
    public native @ByRef @Name("operator ++") LineIterator increment();
    /** \brief postfix increment operator (it++). shifts iterator to the next pixel
    */
    public native @ByVal @Name("operator ++") LineIterator increment(int arg0);
    /** \brief returns coordinates of the current pixel
    */
    public native @ByVal Point pos();

    public native @Cast("uchar*") BytePointer ptr(); public native LineIterator ptr(BytePointer ptr);
    @MemberGetter public native @Cast("const uchar*") BytePointer ptr0();
    public native int step(); public native LineIterator step(int step);
    public native int elemSize(); public native LineIterator elemSize(int elemSize);
    public native int err(); public native LineIterator err(int err);
    public native int count(); public native LineIterator count(int count);
    public native int minusDelta(); public native LineIterator minusDelta(int minusDelta);
    public native int plusDelta(); public native LineIterator plusDelta(int plusDelta);
    public native int minusStep(); public native LineIterator minusStep(int minusStep);
    public native int plusStep(); public native LineIterator plusStep(int plusStep);
}

/** \cond IGNORED */

// === LineIterator implementation ===









/** \endcond
 <p>
 *  \} imgproc_draw
 <p>
 *  \} imgproc */

 // cv

// #ifndef DISABLE_OPENCV_24_COMPATIBILITY
// #include "opencv2/imgproc/imgproc_c.h"
// #endif

// #endif


// Parsed from <opencv2/imgproc/detail/distortion_model.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_IMGPROC_DETAIL_DISTORTION_MODEL_HPP__
// #define __OPENCV_IMGPROC_DETAIL_DISTORTION_MODEL_HPP__

/** \cond IGNORED */
/**
Computes the matrix for the projection onto a tilted image sensor
@param tauX angular parameter rotation around x-axis
@param tauY angular parameter rotation around y-axis
@param matTilt if not NULL returns the matrix
\f[
\vecthreethree{R_{33}(\tau_x, \tau_y)}{0}{-R_{13}((\tau_x, \tau_y)}
{0}{R_{33}(\tau_x, \tau_y)}{-R_{23}(\tau_x, \tau_y)}
{0}{0}{1} R(\tau_x, \tau_y)
\f]
where
\f[
R(\tau_x, \tau_y) =
\vecthreethree{\cos(\tau_y)}{0}{-\sin(\tau_y)}{0}{1}{0}{\sin(\tau_y)}{0}{\cos(\tau_y)}
\vecthreethree{1}{0}{0}{0}{\cos(\tau_x)}{\sin(\tau_x)}{0}{-\sin(\tau_x)}{\cos(\tau_x)} =
\vecthreethree{\cos(\tau_y)}{\sin(\tau_y)\sin(\tau_x)}{-\sin(\tau_y)\cos(\tau_x)}
{0}{\cos(\tau_x)}{\sin(\tau_x)}
{\sin(\tau_y)}{-\cos(\tau_y)\sin(\tau_x)}{\cos(\tau_y)\cos(\tau_x)}.
\f]
@param dMatTiltdTauX if not NULL it returns the derivative of matTilt with
respect to \f$\tau_x\f$.
@param dMatTiltdTauY if not NULL it returns the derivative of matTilt with
respect to \f$\tau_y\f$.
@param invMatTilt if not NULL it returns the inverse of matTilt
**/
 // namespace detail, cv


/** \endcond */

// #endif // __OPENCV_IMGPROC_DETAIL_DISTORTION_MODEL_HPP__


}
