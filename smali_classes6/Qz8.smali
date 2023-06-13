.class public final LQz8;
.super LYA8;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYA8;-><init>(LQz8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b(Ljava/lang/String;I)LUB8;
    .locals 2

    sget-object p2, LsC8;->c:LEC8;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2, v0}, LFE8;->j(Ljava/lang/String;ILEC8;Z)LUB8;

    move-result-object p1

    return-object p1
.end method
