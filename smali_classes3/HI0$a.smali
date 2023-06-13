.class public final LHI0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ51$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHI0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LHI0$a;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/content/DialogInterface;Lio/reactivex/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Landroid/content/DialogInterface;",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LHI0$a;->a:LHI0$a;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/content/DialogInterface;Lio/reactivex/p;LGI0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LHI0$a;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/content/DialogInterface;Lio/reactivex/p;)V

    return-void
.end method


# virtual methods
.method public a(LQ51;)V
    .locals 0

    return-void
.end method
