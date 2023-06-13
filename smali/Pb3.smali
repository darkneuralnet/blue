.class public LPb3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ljava/lang/CharSequence;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:Landroid/net/Uri;

.field public h:Landroid/media/AudioAttributes;

.field public i:Z

.field public j:I

.field public k:Z

.field public l:[J

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Z

.field public p:I

.field public q:Z

.field public r:Z


# direct methods
.method public constructor <init>(Landroid/app/NotificationChannel;)V
    .locals 3

    invoke-static {p1}, Lpb3;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lfa3;->a(Landroid/app/NotificationChannel;)I

    move-result v1

    invoke-direct {p0, v0, v1}, LPb3;-><init>(Ljava/lang/String;I)V

    invoke-static {p1}, LOb3;->a(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LPb3;->b:Ljava/lang/CharSequence;

    invoke-static {p1}, Lqb3;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LPb3;->d:Ljava/lang/String;

    invoke-static {p1}, Lrb3;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LPb3;->e:Ljava/lang/String;

    invoke-static {p1}, Lsb3;->a(Landroid/app/NotificationChannel;)Z

    move-result v0

    iput-boolean v0, p0, LPb3;->f:Z

    invoke-static {p1}, Ltb3;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, LPb3;->g:Landroid/net/Uri;

    invoke-static {p1}, Lub3;->a(Landroid/app/NotificationChannel;)Landroid/media/AudioAttributes;

    move-result-object v0

    iput-object v0, p0, LPb3;->h:Landroid/media/AudioAttributes;

    invoke-static {p1}, Lvb3;->a(Landroid/app/NotificationChannel;)Z

    move-result v0

    iput-boolean v0, p0, LPb3;->i:Z

    invoke-static {p1}, Lwb3;->a(Landroid/app/NotificationChannel;)I

    move-result v0

    iput v0, p0, LPb3;->j:I

    invoke-static {p1}, LAb3;->a(Landroid/app/NotificationChannel;)Z

    move-result v0

    iput-boolean v0, p0, LPb3;->k:Z

    invoke-static {p1}, LHb3;->a(Landroid/app/NotificationChannel;)[J

    move-result-object v0

    iput-object v0, p0, LPb3;->l:[J

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p1}, LIb3;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, LPb3;->m:Ljava/lang/String;

    invoke-static {p1}, LJb3;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, LPb3;->n:Ljava/lang/String;

    :cond_0
    invoke-static {p1}, LKb3;->a(Landroid/app/NotificationChannel;)Z

    move-result v2

    iput-boolean v2, p0, LPb3;->o:Z

    invoke-static {p1}, LLb3;->a(Landroid/app/NotificationChannel;)I

    move-result v2

    iput v2, p0, LPb3;->p:I

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_1

    invoke-static {p1}, LMb3;->a(Landroid/app/NotificationChannel;)Z

    move-result v2

    iput-boolean v2, p0, LPb3;->q:Z

    :cond_1
    if-lt v0, v1, :cond_2

    invoke-static {p1}, LNb3;->a(Landroid/app/NotificationChannel;)Z

    move-result p1

    iput-boolean p1, p0, LPb3;->r:Z

    :cond_2
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LPb3;->f:Z

    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    iput-object v0, p0, LPb3;->g:Landroid/net/Uri;

    const/4 v0, 0x0

    iput v0, p0, LPb3;->j:I

    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, LPb3;->a:Ljava/lang/String;

    iput p2, p0, LPb3;->c:I

    sget-object p1, Landroid/app/Notification;->AUDIO_ATTRIBUTES_DEFAULT:Landroid/media/AudioAttributes;

    iput-object p1, p0, LPb3;->h:Landroid/media/AudioAttributes;

    return-void
.end method


# virtual methods
.method public a()Landroid/app/NotificationChannel;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, Lia3;->a()V

    iget-object v1, p0, LPb3;->a:Ljava/lang/String;

    iget-object v2, p0, LPb3;->b:Ljava/lang/CharSequence;

    iget v3, p0, LPb3;->c:I

    invoke-static {v1, v2, v3}, Lha3;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object v1

    iget-object v2, p0, LPb3;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lxb3;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    iget-object v2, p0, LPb3;->e:Ljava/lang/String;

    invoke-static {v1, v2}, Lyb3;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    iget-boolean v2, p0, LPb3;->f:Z

    invoke-static {v1, v2}, Lzb3;->a(Landroid/app/NotificationChannel;Z)V

    iget-object v2, p0, LPb3;->g:Landroid/net/Uri;

    iget-object v3, p0, LPb3;->h:Landroid/media/AudioAttributes;

    invoke-static {v1, v2, v3}, LBb3;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    iget-boolean v2, p0, LPb3;->i:Z

    invoke-static {v1, v2}, LCb3;->a(Landroid/app/NotificationChannel;Z)V

    iget v2, p0, LPb3;->j:I

    invoke-static {v1, v2}, LDb3;->a(Landroid/app/NotificationChannel;I)V

    iget-object v2, p0, LPb3;->l:[J

    invoke-static {v1, v2}, LEb3;->a(Landroid/app/NotificationChannel;[J)V

    iget-boolean v2, p0, LPb3;->k:Z

    invoke-static {v1, v2}, LFb3;->a(Landroid/app/NotificationChannel;Z)V

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_1

    iget-object v0, p0, LPb3;->m:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v2, p0, LPb3;->n:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-static {v1, v0, v2}, LGb3;->a(Landroid/app/NotificationChannel;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v1
.end method
