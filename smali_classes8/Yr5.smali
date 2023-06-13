.class public LYr5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXr5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LXr5;"
    }
.end annotation


# instance fields
.field public b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYr5;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lw01;)V
    .locals 1

    iget-object v0, p0, LYr5;->b:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lw01;->b(Ljava/lang/Object;)Lw01;

    return-void
.end method
