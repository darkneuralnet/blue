.class public final LAw9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ88;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYt9;

    invoke-direct {v0}, LYt9;-><init>()V

    sput-object v0, LAw9;->a:LQ88;

    return-void
.end method

.method public static a(I)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_2

    const/4 v1, 0x2

    if-eq p0, v0, :cond_1

    if-eq p0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x3

    return p0

    :cond_1
    return v1

    :cond_2
    return v0
.end method
