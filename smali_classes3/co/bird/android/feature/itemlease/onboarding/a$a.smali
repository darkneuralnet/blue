.class public final Lco/bird/android/feature/itemlease/onboarding/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptActivity$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/itemlease/onboarding/a;
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

.method public synthetic constructor <init>(LrK0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/itemlease/onboarding/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LK3;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/feature/itemlease/onboarding/HelmetLeasePromptActivity$a;
    .locals 8

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lco/bird/android/feature/itemlease/onboarding/a$b;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lco/bird/android/feature/itemlease/onboarding/a$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LK3;Lco/bird/android/model/wire/WireBird;LsK0;)V

    return-object v7
.end method