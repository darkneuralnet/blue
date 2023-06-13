.class public final LHc8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWc8;


# instance fields
.field public final synthetic a:LTD7;


# direct methods
.method public constructor <init>(LTD7;)V
    .locals 0

    iput-object p1, p0, LHc8;->a:LTD7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(I)B
    .locals 1

    iget-object v0, p0, LHc8;->a:LTD7;

    invoke-virtual {v0, p1}, LTD7;->s(I)B

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LHc8;->a:LTD7;

    invoke-virtual {v0}, LTD7;->size()I

    move-result v0

    return v0
.end method
