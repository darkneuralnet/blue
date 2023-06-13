.class public final LFs7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:Ljava/lang/Object;

.field public final d:Lzt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lzt7;->a()Lzt7;

    move-result-object v0

    iput-object v0, p0, LFs7;->d:Lzt7;

    return-void
.end method

.method public constructor <init>(Lzt7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LFs7;->d:Lzt7;

    return-void
.end method
