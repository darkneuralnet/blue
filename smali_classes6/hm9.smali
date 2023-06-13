.class public final Lhm9;
.super Lcf9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "LEm9<",
        "TT;*>;>",
        "Lcf9<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:LEm9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEm9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcf9;-><init>()V

    iput-object p1, p0, Lhm9;->b:LEm9;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lti9;Lsk9;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/recaptcha/zzrr;
        }
    .end annotation

    iget-object v0, p0, Lhm9;->b:LEm9;

    invoke-static {v0, p1, p2}, LEm9;->s(LEm9;Lti9;Lsk9;)LEm9;

    move-result-object p1

    return-object p1
.end method
