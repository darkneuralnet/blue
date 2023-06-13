.class public LyT2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LkF0;

.field public b:LU74;


# direct methods
.method public constructor <init>(LkF0;LU74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyT2;->a:LkF0;

    iput-object p2, p0, LyT2;->b:LU74;

    return-void
.end method


# virtual methods
.method public a()LkF0;
    .locals 1

    iget-object v0, p0, LyT2;->a:LkF0;

    return-object v0
.end method

.method public b()LU74;
    .locals 1

    iget-object v0, p0, LyT2;->b:LU74;

    return-object v0
.end method
