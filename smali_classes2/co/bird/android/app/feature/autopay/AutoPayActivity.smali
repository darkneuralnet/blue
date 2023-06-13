.class public final Lco/bird/android/app/feature/autopay/AutoPayActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/autopay/AutoPayActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00082\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/app/feature/autopay/AutoPayActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "<init>",
        "()V",
        "B",
        "a",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final B:Lco/bird/android/app/feature/autopay/AutoPayActivity$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/autopay/AutoPayActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/autopay/AutoPayActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/autopay/AutoPayActivity;->B:Lco/bird/android/app/feature/autopay/AutoPayActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 20

    invoke-super/range {p0 .. p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget v0, Lcj4;->autopay:I

    move-object/from16 v7, p0

    invoke-virtual {v7, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    new-instance v0, Lgr;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->M()LEg1;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->X()Lgl;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->b0()Llh6;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->P()Lqi1;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->X()Lgl;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const-string v1, "resources"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v17, Lco/bird/android/app/feature/autopay/c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object/from16 v1, v17

    move-object/from16 v2, p0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/autopay/c;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;Lco/bird/android/app/feature/autopay/b$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v18

    const/16 v19, 0x1

    move-object v1, v8

    move-object v8, v0

    move-object/from16 v16, v1

    invoke-direct/range {v8 .. v19}, Lgr;-><init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LEg1;Lgl;Llh6;Lqi1;Lgl;LTq4;Landroid/content/res/Resources;Lco/bird/android/app/feature/autopay/b;Le13;Z)V

    invoke-virtual {v0}, Lgr;->a()V

    return-void
.end method
