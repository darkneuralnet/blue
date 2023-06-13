.class public final Lco/bird/android/feature/itemlease/onboarding/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/itemlease/onboarding/b;
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

.method public synthetic constructor <init>(LxK0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/itemlease/onboarding/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LN3;Lco/bird/android/model/wire/WireBird;LDQ3;)Lco/bird/android/feature/itemlease/onboarding/HelmetLeaseUnlockTutorialActivity$a;
    .locals 9

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lco/bird/android/feature/itemlease/onboarding/b$b;

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lco/bird/android/feature/itemlease/onboarding/b$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LN3;Lco/bird/android/model/wire/WireBird;LDQ3;LyK0;)V

    return-object v8
.end method
