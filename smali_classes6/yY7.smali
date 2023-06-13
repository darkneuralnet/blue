.class public final synthetic LyY7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:LH68;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:J

.field public final synthetic d:LcW8;

.field public final synthetic e:LKu6;

.field public final synthetic f:Z

.field public final synthetic g:Ljava/lang/Boolean;

.field public final synthetic h:Lg32;


# direct methods
.method public synthetic constructor <init>(LH68;Ljava/util/List;JLcW8;LKu6;ZLjava/lang/Boolean;Lg32;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyY7;->a:LH68;

    iput-object p2, p0, LyY7;->b:Ljava/util/List;

    iput-wide p3, p0, LyY7;->c:J

    iput-object p5, p0, LyY7;->d:LcW8;

    iput-object p6, p0, LyY7;->e:LKu6;

    iput-boolean p7, p0, LyY7;->f:Z

    iput-object p8, p0, LyY7;->g:Ljava/lang/Boolean;

    iput-object p9, p0, LyY7;->h:Lg32;

    return-void
.end method


# virtual methods
.method public final a()Lqf9;
    .locals 9

    iget-object v0, p0, LyY7;->a:LH68;

    iget-object v1, p0, LyY7;->b:Ljava/util/List;

    iget-wide v2, p0, LyY7;->c:J

    iget-object v4, p0, LyY7;->d:LcW8;

    iget-object v5, p0, LyY7;->e:LKu6;

    iget-boolean v6, p0, LyY7;->f:Z

    iget-object v7, p0, LyY7;->g:Ljava/lang/Boolean;

    iget-object v8, p0, LyY7;->h:Lg32;

    invoke-virtual/range {v0 .. v8}, LH68;->k(Ljava/util/List;JLcW8;LKu6;ZLjava/lang/Boolean;Lg32;)Lqf9;

    move-result-object v0

    return-object v0
.end method
