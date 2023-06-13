.class final Lcom/google/android/filament/TextureSampler$EnumCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/TextureSampler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "EnumCache"
.end annotation


# static fields
.field static final sCompareFunctionValues:[Lcom/google/android/filament/TextureSampler$CompareFunction;

.field static final sCompareModeValues:[Lcom/google/android/filament/TextureSampler$CompareMode;

.field static final sMagFilterValues:[Lcom/google/android/filament/TextureSampler$MagFilter;

.field static final sMinFilterValues:[Lcom/google/android/filament/TextureSampler$MinFilter;

.field static final sWrapModeValues:[Lcom/google/android/filament/TextureSampler$WrapMode;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/filament/TextureSampler$MinFilter;->values()[Lcom/google/android/filament/TextureSampler$MinFilter;

    move-result-object v0

    sput-object v0, Lcom/google/android/filament/TextureSampler$EnumCache;->sMinFilterValues:[Lcom/google/android/filament/TextureSampler$MinFilter;

    invoke-static {}, Lcom/google/android/filament/TextureSampler$MagFilter;->values()[Lcom/google/android/filament/TextureSampler$MagFilter;

    move-result-object v0

    sput-object v0, Lcom/google/android/filament/TextureSampler$EnumCache;->sMagFilterValues:[Lcom/google/android/filament/TextureSampler$MagFilter;

    invoke-static {}, Lcom/google/android/filament/TextureSampler$WrapMode;->values()[Lcom/google/android/filament/TextureSampler$WrapMode;

    move-result-object v0

    sput-object v0, Lcom/google/android/filament/TextureSampler$EnumCache;->sWrapModeValues:[Lcom/google/android/filament/TextureSampler$WrapMode;

    invoke-static {}, Lcom/google/android/filament/TextureSampler$CompareMode;->values()[Lcom/google/android/filament/TextureSampler$CompareMode;

    move-result-object v0

    sput-object v0, Lcom/google/android/filament/TextureSampler$EnumCache;->sCompareModeValues:[Lcom/google/android/filament/TextureSampler$CompareMode;

    invoke-static {}, Lcom/google/android/filament/TextureSampler$CompareFunction;->values()[Lcom/google/android/filament/TextureSampler$CompareFunction;

    move-result-object v0

    sput-object v0, Lcom/google/android/filament/TextureSampler$EnumCache;->sCompareFunctionValues:[Lcom/google/android/filament/TextureSampler$CompareFunction;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
