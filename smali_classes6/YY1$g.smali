.class public final LYY1$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYY1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final b:LYY1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYY1<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYY1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYY1<",
            "**>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYY1$g;->b:LYY1;

    return-void
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYY1$g;->b:LYY1;

    invoke-virtual {v0}, LYY1;->x()LZY1;

    move-result-object v0

    return-object v0
.end method
