.class public Landroidx/work/impl/background/systemjob/SystemJobService$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/background/systemjob/SystemJobService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/job/JobParameters;)Landroid/net/Network;
    .locals 0

    invoke-static {p0}, LhY5;->a(Landroid/app/job/JobParameters;)Landroid/net/Network;

    move-result-object p0

    return-object p0
.end method
