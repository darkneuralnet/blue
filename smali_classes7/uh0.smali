.class public final synthetic Luh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

.field public final synthetic c:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh0;->b:Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    iput-object p2, p0, Luh0;->c:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Luh0;->b:Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    iget-object v1, p0, Luh0;->c:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->y(Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;Landroid/view/View;)V

    return-void
.end method
