.class public final LFx7;
.super LPA7;
.source "SourceFile"


# instance fields
.field public final synthetic f:LkF7;


# direct methods
.method public constructor <init>(LkF7;)V
    .locals 1

    iput-object p1, p0, LFx7;->f:LkF7;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LPA7;-><init>(LkF7;LaA7;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(I)Ljava/lang/Object;
    .locals 2

    new-instance v0, LGD7;

    iget-object v1, p0, LFx7;->f:LkF7;

    invoke-direct {v0, v1, p1}, LGD7;-><init>(LkF7;I)V

    return-object v0
.end method
