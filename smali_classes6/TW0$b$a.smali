.class public LTW0$b$a;
.super LTW0$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTW0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LTW0$b<",
        "Ljava/util/Date;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, LTW0$b;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    return-object p1
.end method
