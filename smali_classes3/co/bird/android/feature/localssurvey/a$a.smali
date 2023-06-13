.class public final Lco/bird/android/feature/localssurvey/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/localssurvey/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/localssurvey/a;
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

.method public synthetic constructor <init>(LTL0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/localssurvey/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)Lco/bird/android/feature/localssurvey/b;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lco/bird/android/feature/localssurvey/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lco/bird/android/feature/localssurvey/a$b;-><init>(LlG2;Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;LUL0;)V

    return-object v0
.end method
