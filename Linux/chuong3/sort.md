14. We may also sort the contents of a file or the output based upon more than one column. Sort the output of ‘ls -l‘ command on the basis of field 2,5 (Numeric) and 9 (Non-Numeric).
```console
ls -l /home/$USER | sort -t "," -nk2,5 -k9
```
