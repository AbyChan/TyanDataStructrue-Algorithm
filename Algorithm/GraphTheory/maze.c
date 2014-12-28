#define MAX_SIZE  8 int H[4] = {0, 1, 0, -1};  int V[4] = {-1, 0, 1, 0};            
char Maze[MAX_SIZE][MAX_SIZE] = {{'X','X','X','X','X','X','X','X'},                                  {'o','o','o','o','o','X','X','X'},                                  {'X','o','X','X','o','o','o','X'},                              {'X','o','X','X','o','X','X','o'},                          {'X','o','X','X','X','X','X','X'}, {'X','o','X','X','o','o','o','X'}, 



  


         {'X','o','o','o','o','X','o','o'}, 
                                 {'X','X','X','X','X','X','X','X'}}; void FindPath(int X, int Y) { 
    if(X == MAX_SIZE || Y == MAX_SIZE) {        for(int i = 0; i < MAX_SIZE; i++) for(int j = 0; j < MAX_SIZE; j++) 
                  printf("%c%c", Maze[j], j < MAX_SIZE-1 ? ' ' : '\n'); }else for(int k = 0; k < 4; k++)  
if(X >= 0 && Y >= 0 && Y < MAX_SIZE && X < MAX_SIZE && 'o' == Maze[X][Y]) {                    Maze[X][Y] = ' '; 
                   FindPath(X+V[k], Y+H[k]);                    Maze[X][Y] ='o';  } } 
int main(int argc, char* argv[]) {     FindPath(1,0); } 
