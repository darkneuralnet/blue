.class public Lfc9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LSe9;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "shared-installation-id"

    invoke-static {v0}, Lyg9;->b(Ljava/lang/String;)LSe9;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lfc9;->a:LSe9;

    return-void
.end method

.method public constructor <init>(LSe9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfc9;->a:LSe9;

    return-void
.end method


# virtual methods
.method public final a(LmW8;LYb9;)V
    .locals 2

    iget-object v0, p0, Lfc9;->a:LSe9;

    new-instance v1, LyW8;

    invoke-direct {v1}, LyW8;-><init>()V

    invoke-virtual {p2}, LYb9;->a()LV69;

    move-result-object p2

    invoke-virtual {p2}, LV69;->i()Lr79;

    move-result-object p2

    invoke-virtual {v1, p2}, LyW8;->j(Lr79;)LyW8;

    invoke-static {v1}, Lqf9;->d(LyW8;)Lqf9;

    move-result-object p2

    const-string v1, "o:a:mlkit:1.0.0"

    invoke-virtual {v0, p2, p1, v1}, LSe9;->e(Lqf9;LmW8;Ljava/lang/String;)V

    return-void
.end method
