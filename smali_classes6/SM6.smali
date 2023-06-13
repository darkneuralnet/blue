.class public final synthetic LSM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LsK6;


# static fields
.field public static final a:LsK6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LSM6;

    invoke-direct {v0}, LSM6;-><init>()V

    sput-object v0, LSM6;->a:LsK6;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, LYJ6;->d5(Landroid/os/IBinder;)LaK6;

    move-result-object p1

    return-object p1
.end method
