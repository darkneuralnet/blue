.class public final Lco/bird/android/feature/birdratinghistory/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/birdratinghistory/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/birdratinghistory/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LeH0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/birdratinghistory/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Landroid/app/Activity;Ljava/lang/String;)Lco/bird/android/feature/birdratinghistory/a;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lco/bird/android/feature/birdratinghistory/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lco/bird/android/feature/birdratinghistory/b$a;-><init>(LlG2;Landroid/app/Activity;Ljava/lang/String;LdH0;)V

    return-object v0
.end method
