.class public final LsC8;
.super LEC8;
.source "SourceFile"


# static fields
.field public static final c:LEC8;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LsC8;

    new-instance v1, LNA5;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LNA5;-><init>(I)V

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, LsC8;-><init>(LEC8;LNA5;)V

    invoke-virtual {v0}, LEC8;->a()LEC8;

    sput-object v0, LsC8;->c:LEC8;

    return-void
.end method

.method public constructor <init>(LEC8;LNA5;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1, p2, p1}, LEC8;-><init>(LEC8;LNA5;LgC8;)V

    return-void
.end method
