.class public final Lco/bird/android/feature/tutorial/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/tutorial/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/tutorial/a;
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

.method public synthetic constructor <init>(LjR0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/tutorial/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;LHa6;)Lco/bird/android/feature/tutorial/b;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lco/bird/android/feature/tutorial/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p1, v1}, Lco/bird/android/feature/tutorial/a$b;-><init>(LHa6;LlG2;LkR0;)V

    return-object v0
.end method
