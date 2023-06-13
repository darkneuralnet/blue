.class public final Lco/bird/android/feature/complaintresolution/scanner/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/complaintresolution/scanner/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/complaintresolution/scanner/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LxR0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/complaintresolution/scanner/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;)Lco/bird/android/feature/complaintresolution/scanner/b;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lco/bird/android/feature/complaintresolution/scanner/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lco/bird/android/feature/complaintresolution/scanner/a$b;-><init>(LlG2;LyR0;)V

    return-object v0
.end method
