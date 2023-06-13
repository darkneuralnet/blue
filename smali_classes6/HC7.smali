.class public final LHC7;
.super LKn2;
.source "SourceFile"


# instance fields
.field public final b:LyU2;


# direct methods
.method public constructor <init>(LyU2;)V
    .locals 0

    invoke-direct {p0}, LKn2;-><init>()V

    iput-object p1, p0, LHC7;->b:LyU2;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LMd3;

    new-instance v0, LH68;

    iget-object v1, p0, LHC7;->b:LyU2;

    invoke-direct {v0, v1, p1}, LH68;-><init>(LyU2;LMd3;)V

    return-object v0
.end method
