.class public Lw12$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw12;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lvn4;


# direct methods
.method public constructor <init>(Lvn4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw12$b;->a:Lvn4;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, LAr2;

    iget-object v0, p0, Lw12$b;->a:Lvn4;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, LAr2;->b(I)LyB0;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, LAr2;->b(I)LyB0;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lvn4;->a(LyB0;LyB0;)V

    return-void
.end method
