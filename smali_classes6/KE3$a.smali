.class public LKE3$a;
.super LKE3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKE3;->a(LKE3$b;LQ70;Ljava/lang/Class;)LKE3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LKE3<",
        "TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:LKE3$b;


# direct methods
.method public constructor <init>(LQ70;Ljava/lang/Class;LKE3$b;)V
    .locals 0

    iput-object p3, p0, LKE3$a;->c:LKE3$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, LKE3;-><init>(LQ70;Ljava/lang/Class;LKE3$a;)V

    return-void
.end method
