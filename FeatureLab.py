'''
Given a circular playlist of songs, you can only press up and down to
skip to the song you would like. At the end of the playlist, you can press down
and go to the first song in the playlist. Return the number of up or down you would
need to go from your current song to the song you desire.

@param songs - string array containing songs' names
@param k - index of the current song playing
@parm q - the song I would like to skip to
@return num - the number of times I would have to press up or down
from k to q
'''

def playlist(songs, k, q):
    for i in range(len(songs)):
        if(songs[i] == q):
            index = i
    if index == 0:
        oneAns = abs(k-index)
        secAns = abs(k-len(songs))
        if oneAns < secAns:
            return oneAns
        else:
            return secAns
    else:
        return abs(k-index)

def main():
    songs = ["Whatever It Takes", "I Lived", "Don't Blame Me", "When We Were Young", "2:34", 'Let Me Go', 'Spectrum']
    print(playlist(songs, 4, "Whatever It Takes"))

if __name__ == "__main__":
    main()
