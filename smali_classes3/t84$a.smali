.class public final Lt84$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt84;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lt84;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt84;

    invoke-direct {v0}, Lt84;-><init>()V

    sput-object v0, Lt84$a;->a:Lt84;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a()Lt84;
    .locals 1

    sget-object v0, Lt84$a;->a:Lt84;

    return-object v0
.end method
