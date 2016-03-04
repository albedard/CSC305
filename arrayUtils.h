#ifndef ARRAY_UTILS_H
#define ARRAY_UTILS_H

// Creates 1D arrays with indices going from rowMin to rowMax (inclusive)
// return a NULL pointer in case of failure
unsigned char* ucVector(int rowMin,int rowMax);
int* iVector(int rowMin,int rowMax);

// Creates 2D arrays with indices going from rowMin to rowMax
//	and colMin to colMax (inclusive)
// return a NULL pointer in case of failure
unsigned** ucMatrix(int rowMin,int rowMax,int colMin,int colMax);
int** iMatrix(int rowMin,int rowMax,int colMin,int colMax);

// Frees a vector allocated by ucVector or iVector
// return 0 if all went well, a non-zero value otherwise
int free_ucVector(unsigned char* v,int rowMin);
int free_iVector(int* v,int rowMin);

// Frees a matrix allocated by ucMatrix or iMatrix
// return 0 if all went well, a non-zero value otherwise
int free_ucMatrix(unsigned char** m,int rowMin, int rowMax, int colMin);
int free_iMatrix(unsigned char** m,int rowMin, int rowMax, int colMin);

// Maps a "scaffolding" 2D array on top of an existing 0-based 1D array
// You can only assume that the input array a has been allocated with the
//	proper size
// return a NULL pointer in case of failure
unsigned char** ucMatrixFromArray1D(unsigned char* a, int rowMin,int rowMax,int colMin,int colMax);
int** ucMatrixFromArray1D(int* a, int rowMin,int rowMax,int colMin,int colMax);

// Frees a "scaffolding" matrix structure (but not the underlying data array) allocated by
//	MatrixFromArray1D
// return 0 if all went well, a non-zero value otherwise
int free_ucScaffoldingMatrix(unsigned char** m,int rowMin);
int free_iScaffoldingMatrix(unsigned char** m,int rowMin);

#endif	//	ARRAY_UTILS_H