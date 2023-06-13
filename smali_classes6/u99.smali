.class public final synthetic Lu99;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/OptionalModuleApi;


# instance fields
.field public final synthetic b:[Lcom/google/android/gms/common/Feature;


# direct methods
.method public synthetic constructor <init>([Lcom/google/android/gms/common/Feature;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu99;->b:[Lcom/google/android/gms/common/Feature;

    return-void
.end method


# virtual methods
.method public final getOptionalFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 2

    iget-object v0, p0, Lu99;->b:[Lcom/google/android/gms/common/Feature;

    sget-object v1, Lmy3;->a:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method
