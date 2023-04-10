#include<iostream>
#include<windows.h>

void GOTOXY(int x, int y );
void SetWindowSize(SHORT width, SHORT height);
void SetScreenBufferSize(SHORT width, SHORT height);
void ShowCur(bool CursorVisibility); 
void Color(int color);
void keyPress(WORD keyCode);
void keyRelease(WORD keyCode);

