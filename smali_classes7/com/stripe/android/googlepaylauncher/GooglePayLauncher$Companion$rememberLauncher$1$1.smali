.class final Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion$rememberLauncher$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion;->rememberLauncher(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ResultCallback;LEt0;I)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $currentReadyCallback$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion$rememberLauncher$1$1;->$currentReadyCallback$delegate:LsP5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReady(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion$rememberLauncher$1$1;->$currentReadyCallback$delegate:LsP5;

    invoke-static {v0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Companion;->access$rememberLauncher$lambda$0(LsP5;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$ReadyCallback;->onReady(Z)V

    return-void
.end method
