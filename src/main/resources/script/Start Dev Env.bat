@echo off

for /f "skip=3 tokens=4" %%i in ('sc query MySQL57') do set "zt=%%i" &goto :next

:next
if /i "%zt%"=="RUNNING" (
    echo �Ѿ����ָ÷��������У������Ѿ�ֹͣ����
    net stop MySQL57
	taskkill /f /im navicat.exe
) else (
    echo �÷������ڴ���ֹͣ״̬,����������
    net start MySQL57
	start "" "D:\DevProgrm\PremiumSoft\Navicat Premium\navicat.exe"
)

pause