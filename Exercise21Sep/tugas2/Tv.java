class Tv{
    int channel, volume;
    boolean stat;
    final int channel_max=100;
    final int channel_min=1;
    final int volume_max=15;
    final int volume_min=1;

    Tv()
    {
        this.channel=1;
        this.volume=1;
        this.stat=false;
    }
    public boolean onoff()
    {
        if(stat==true)
        {
            return true;
        }
        return false;

    }
    public void incChannel()
    {
        if(onoff())
        {
            channel++;
            if(channel>channel_max)
            {
                channel=channel_min;
            }
            System.out.println("Your channel is now "+channel);
        }
        else
        {
            System.out.println("The Tv is off. Please turn it on");
        }
    }
    public void decChannel()
    {
        if(onoff())
        {
            channel--;
            if(channel<channel_min)
            {
                channel=channel_max;
            }
            System.out.println("Your channel is now "+channel);
        }
        else
        {
            System.out.println("The Tv is off. Please turn it on");
        }
    }
    public void chgChannel(int chan)
    {
        if(chan<=0 || chan>100)
        {
            System.out.println("Invalid Channel");
        }
        else
        {
            channel=chan;
            System.out.println("Your channel is now "+channel);
        }
    }
    public void incVolume()
    {
        if(onoff())
        {
            volume++;
            if(volume>volume_max)
            {
                volume=volume_max;
                System.out.println("Volume is at max, cannot increased further");
            }
            else
            {
                System.out.println("Your volume is now "+volume);
            }
            
        }
        else
        {
            System.out.println("The Tv is off. Please turn it on");
        }
    }
    public void decVolume()
    {
        if(onoff())
        {
            volume--;
            if(volume<volume_min)
            {
                volume=volume_min;
                System.out.println("Volume cannot be decreased further");
            }
            else
            {
                System.out.println("Your volume is now "+volume);
            }
            
        }
        else
        {
            System.out.println("The Tv is off. Please turn it on");
        }
    }
    public int currentVolume()
    {
        return volume;
    }
    public int currentChannel()
    {
        return channel;
    }
    public void tvStatus()
    {
        if(onoff())
        {
            System.out.println("TV is on");
            System.out.println("Channel number: "+channel);
            System.out.println("Volume: "+volume);
        }
        else{
            System.out.println("Tv is off");
        }
    }

}